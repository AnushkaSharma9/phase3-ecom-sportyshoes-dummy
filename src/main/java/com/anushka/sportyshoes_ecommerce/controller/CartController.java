//package com.anushka.sportyshoes_ecommerce.controller;
//
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.anushka.sportyshoes_ecommerce.entity.Cart;
//import com.anushka.sportyshoes_ecommerce.exceptions.InvalidProductException;
//import com.anushka.sportyshoes_ecommerce.repository.CartRepository;
//import com.anushka.sportyshoes_ecommerce.service.ShoppingCartService;
//
//@RestController
//@RequestMapping("/shoppingCart")
//public class CartController {
//
//    @Autowired
//    private ShoppingCartService shoppingCartService;
//
//    @RequestMapping(method = RequestMethod.POST)
//    public Cart addProductItem(@RequestBody Cart cartObj) {
//        return shoppingCartService.saveProducts(cartObj);
//    }
//
//
//    @RequestMapping(method = RequestMethod.GET)
//    public List<Cart> getAll(){
//        return shoppingCartService.findAll();
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, produces = "application/json", consumes = "application/json", value ="/{id}")
//    public Cart updateProductItem(@RequestBody Cart shoppingCartDTO, @PathVariable("id") Long ids) {
//        return shoppingCartService.updateProduct(shoppingCartDTO, ids);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, value ="/{id}")
//    public void deleteProductItem(@PathVariable("id") Long ids) {
//        shoppingCartService.deleteProduct(ids);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE)
//    public void ClearCart( Object object) {
//        shoppingCartService.clearShoppingCart(object);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/purchase/{id}")
//    public void purchaseProducts(@PathVariable("id") Long id) {
//        shoppingCartService.purchaseProducts(id);
//    }
//}