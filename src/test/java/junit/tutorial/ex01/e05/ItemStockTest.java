package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ItemStockTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	//初期状態でgetNumで0が取得できる
	void power1() {
		ItemStock itemStock = new ItemStock();
		Item item1 = new Item("商品",100);
		
		assertEquals(0, itemStock.getNum(item1));
	}
	
	@Test
	//初期状態で、addでItemを追加するとgetNumで1が取得できる
	void power2() {
		ItemStock itemStock = new ItemStock();
		Item item1 = new Item("商品A",100);
		itemStock.add(item1);
		assertEquals(1, itemStock.getNum(item1));			
	}
	
	@Test
	//Ｉｔｅｍが一つ追加されている状態でgetNumで1が取得できる
	void power3() {
		ItemStock itemStock = new ItemStock();
		Item item1 = new Item("商品A",100);
		itemStock.add(item1);
		
		int items = itemStock.getNum(item1);
		assertEquals(1, items);
	}
	
	//Itemが一つ追加されている状態で、addで同じItemオブジェクトを追加すると
	//getNumで2が取得できる
	void power4() {
		ItemStock itemStock = new ItemStock();
		Item item1 = new Item("商品A",100);
		itemStock.add(item1);
		itemStock.add(item1);
		assertEquals(2, itemStock.getNum(item1));
	}
	
	//Itemが一つ追加されている状態で、addで異なるItemオブジェクトを追加すると
	//getNumで1が取得できる
	void power5() {
		ItemStock itemStock = new ItemStock();
		Item item1 = new Item("商品A",100);
		Item item2 = new Item("商品B",100);
		itemStock.add(item1);
		itemStock.add(item2);
		assertEquals(1, itemStock.getNum(item2));
		
	}
}
