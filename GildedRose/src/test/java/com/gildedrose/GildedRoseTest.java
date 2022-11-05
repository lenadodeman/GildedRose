package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

  @Test
  void testNameRandom() {
    Item element1 = new Item("Random", 0, 0);
    GildedRose app = new GildedRose(new Item[] {element1});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,0);
  }

  @Test
  void testNameRandom2() {
    Item element2 = new Item("Random", 0, 2);
    GildedRose app = new GildedRose(new Item[] {element2});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,0);
  }

  @Test
  void testNameRandom3() {
    Item element3 = new Item("Random", 2, 0);
    GildedRose app = new GildedRose(new Item[] {element3});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,1);
    Assertions.assertEquals(app.items[0].quality,0);
  }

  @Test
  void testNameAgedBrie1() {
    Item element4 = new Item("Aged Brie",0,52);
    GildedRose app = new GildedRose(new Item[] {element4});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,52);
  }

  @Test
  void testNameAgedBrie2() {
    Item element5 = new Item("Aged Brie",4,52);
    GildedRose app = new GildedRose(new Item[] {element5});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,3);
    Assertions.assertEquals(app.items[0].quality,52);
  }

  @Test
  void testNameBackstage1() {
    Item element5 = new Item("Backstage passes to a TAFKAL80ETC concert",4,10);
    GildedRose app = new GildedRose(new Item[] {element5});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,3);
    Assertions.assertEquals(app.items[0].quality,13);
  }

  @Test
  void testNameBackstage2() {
    Item element6 = new Item("Backstage passes to a TAFKAL80ETC concert",0,45);
    GildedRose app = new GildedRose(new Item[] {element6});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,0);
  }

  @Test
  void testNameBackstage3() {
    Item element7 = new Item("Backstage passes to a TAFKAL80ETC concert",12,49);
    GildedRose app = new GildedRose(new Item[] {element7});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,11);
    Assertions.assertEquals(app.items[0].quality,50);
  }

  @Test
  void testNameSulfuras1() {
    Item element8 = new Item("Sulfuras, Hand of Ragnaros",0,0);
    GildedRose app = new GildedRose(new Item[] {element8});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,0);
    Assertions.assertEquals(app.items[0].quality,0);
  }

  @Test
  void testNameBackstage4() {
    Item element9 = new Item("Backstage passes to a TAFKAL80ETC concert",4,48);
    GildedRose app = new GildedRose(new Item[] {element9});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,3);
    Assertions.assertEquals(app.items[0].quality,50);
  }

  @Test
  void testNameSulfuras2() {
    Item element10 = new Item("Sulfuras, Hand of Ragnaros",-1,10);
    GildedRose app = new GildedRose(new Item[] {element10});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,10);
  }

  @Test
  void testNameBackstage5() {
    Item element11 = new Item("Backstage passes to a TAFKAL80ETC concert",5,49);
    GildedRose app = new GildedRose(new Item[] {element11});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,4);
    Assertions.assertEquals(app.items[0].quality,50);
  }

  @Test
  void testConjured1() {
    Item element12 = new Item("Conjured",0,40);
    GildedRose app = new GildedRose(new Item[] {element12});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,39);
  }

  @Test
  void testConjured2() {
    Item element13 = new Item("Conjured",-1,4);
    GildedRose app = new GildedRose(new Item[] {element13});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-2);
    Assertions.assertEquals(app.items[0].quality,3);
  }

}
