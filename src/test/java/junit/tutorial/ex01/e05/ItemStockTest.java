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
	//������Ԃ�getNum��0���擾�ł���
	void power1() {
		ItemStock itemStock = new ItemStock();
		Item item1 = new Item("���i",100);
		
		assertEquals(0, itemStock.getNum(item1));
	}
	
	@Test
	//������ԂŁAadd��Item��ǉ������getNum��1���擾�ł���
	void power2() {
		ItemStock itemStock = new ItemStock();
		Item item1 = new Item("���iA",100);
		itemStock.add(item1);
		assertEquals(1, itemStock.getNum(item1));			
	}
	
	@Test
	//�h����������ǉ�����Ă����Ԃ�getNum��1���擾�ł���
	void power3() {
		ItemStock itemStock = new ItemStock();
		Item item1 = new Item("���iA",100);
		itemStock.add(item1);
		
		int items = itemStock.getNum(item1);
		assertEquals(1, items);
	}
	
	//Item����ǉ�����Ă����ԂŁAadd�œ���Item�I�u�W�F�N�g��ǉ������
	//getNum��2���擾�ł���
	void power4() {
		ItemStock itemStock = new ItemStock();
		Item item1 = new Item("���iA",100);
		itemStock.add(item1);
		itemStock.add(item1);
		assertEquals(2, itemStock.getNum(item1));
	}
	
	//Item����ǉ�����Ă����ԂŁAadd�ňقȂ�Item�I�u�W�F�N�g��ǉ������
	//getNum��1���擾�ł���
	void power5() {
		ItemStock itemStock = new ItemStock();
		Item item1 = new Item("���iA",100);
		Item item2 = new Item("���iB",100);
		itemStock.add(item1);
		itemStock.add(item2);
		assertEquals(1, itemStock.getNum(item2));
		
	}
}
