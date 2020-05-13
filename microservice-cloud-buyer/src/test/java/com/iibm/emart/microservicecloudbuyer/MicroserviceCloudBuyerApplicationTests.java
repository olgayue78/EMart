package com.iibm.emart.microservicecloudbuyer;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iibm.emart.entity.CartItem;
import com.iibm.emart.entity.PurchaseItem;
import com.iibm.emart.repository.BuyerRepository;

import junit.framework.Assert;



@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class MicroserviceCloudBuyerApplicationTests {

    @Autowired
    private BuyerRepository buyerRepository;
    
    @Test
    public void test() throws Exception {
    	buyerRepository.deletePurchaseItem(-1,1);
    	int purchaseItemsCount = buyerRepository.getPurchaseItems(1).size();
        Assert.assertEquals(0, purchaseItemsCount);
        
        PurchaseItem purchaseItem = new PurchaseItem();
        purchaseItem.setBuyerId(1);
        purchaseItem.setSellerId(2);
        purchaseItem.setItemId(1);
        purchaseItem.setQty(1);
        purchaseItem.setPrice(599.9);
        purchaseItem.setPurchaseDate(new Date());
        Assert.assertEquals(1, buyerRepository.addPurchaseItem(purchaseItem));
        

    	buyerRepository.deleteCartItem(-1,1);
    	int cartItemsCount = buyerRepository.getCartItems(1).size();
        Assert.assertEquals(0, cartItemsCount);
        
        CartItem cartItem = new CartItem();
        cartItem.setBuyerId(1);
        cartItem.setSellerId(2);
        cartItem.setItemId(1);
        cartItem.setQty(1);
        cartItem.setTax(20);
        Assert.assertEquals(1, buyerRepository.addCartItem(cartItem));
    }

}
