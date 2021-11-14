//package com.anushka.sportyshoes_ecommerce.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.anushka.sportyshoes_ecommerce.controller.List;
//import com.anushka.sportyshoes_ecommerce.entity.Cart;
//import com.anushka.sportyshoes_ecommerce.repository.ProductRepository;
//import com.anushka.sportyshoes_ecommerce.repository.ShoppingCartRepository;
//import com.anushka.sportyshoes_ecommerce.repository.UserRepository;
//
//	@Service
//	@Transactional
//	public class ShoppingCartService {
//
//	    @Autowired
//	    private ProductRepository productRepository;
//
//	    @Autowired
//	    private UserRepository userRepository;
//
//	    @Autowired
//	    private ShoppingCartRepository shoppingCartRepository;
//
//	    public ShoppingCart saveProducts(ShoppingCartDTO shoppingCartDTO) {
//	        ShoppingCart shoppingCart = new ShoppingCart();
//	        Product product = productRepository.findOne(shoppingCartDTO.getProductId());
//	        shoppingCart.setProduct(product);
//	        shoppingCart.setUser(userRepository.findOne(1L));
//	        shoppingCart.setStatus(shoppingCartDTO.getStatus());
//	        shoppingCart.setDate(new Date());
//	        shoppingCart.setStock(shoppingCartDTO.getStock());
//	        shoppingCart.setAmount(product.getUnitPrice() * shoppingCartDTO.getStock());
//
//	        return shoppingCartRepository.save(shoppingCart);
//	    }
//
//
//	    public List<ShoppingCart> findAll() {
////	        return shoppingCartRepository.findAll();
//	        return shoppingCartRepository.findByStatus("NOT_PURCHASED");
//	    }
//
//	    public ShoppingCart updateProduct(ShoppingCartDTO shoppingCartDTO, Long id) {
//	        ShoppingCart updateItem = shoppingCartRepository.findOne(id);
//	        updateItem.setStock(shoppingCartDTO.getStock());
//	        updateItem.setAmount(updateItem.getProduct().getUnitPrice() * shoppingCartDTO.getStock());
//	        return shoppingCartRepository.save(updateItem);
//	    }
//
//	    public void deleteProduct(Long id) {
//	        shoppingCartRepository.delete(id);
//	    }
//
//	    public void clearShoppingCart(Object object) {
//	        shoppingCartRepository.delete(findAll());
//	    }
//
//
//	    public List<Cart> findByPurchased() {
//	        return shoppingCartRepository.findByStatus("PURCHASED");
//	    }
//
//
//	    public void purchaseProducts(Long id) {
//	        ShoppingCart shoppingCart = shoppingCartRepository.findOne(id);
//	        shoppingCart.setStatus("PURCHASED");
//	        shoppingCartRepository.save(shoppingCart);
//	    }
//
//
//		public Cart save(Cart cartObj) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//}
