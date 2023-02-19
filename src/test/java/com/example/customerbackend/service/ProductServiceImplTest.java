package com.example.customerbackend.service;


import com.example.customerbackend.model.entity.Product;
import com.example.customerbackend.repository.ProductRepository;
import com.example.customerbackend.service.Impl.ProductServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {

    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductServiceImpl productServiceImpl;

    @Test
    void should_return_product_list_when_call_get_products_given_mockup_product() {
        // Given
        Product product = new Product();
        product.setId(1L);
        product.setName("product1");
        product.setQuantity(10);
        List<Product> productList = List.of(product);
        when(productRepository.findAll()).thenReturn(productList);

        // When
        List<Product> actual = productServiceImpl.getProducts();

        // Then
        assertEquals(productList, actual);
    }

    @Test
    void should_return_empty_list_when_call_get_products_given_get_empty_list_from_repository() {
        // Given
        Product product = new Product();
        List<Product> productList = List.of(product);
        when(productRepository.findAll()).thenReturn(productList);

        // When
        List<Product> actual = productServiceImpl.getProducts();

        // Then
        assertEquals(productList, actual);
    }

    @Test
    void should_return_product_id_when_call_find_by_id_given_get_product_id_list_from_repository() {
        // Given

        Product product = new Product();
        product.setId(1L);

        Optional<Product> optionalProduct = Optional.of(product);
        when(productRepository.findById(product.getId())).thenReturn(optionalProduct);

        // When
        Optional<Product> actual = productServiceImpl.findById(product.getId());

        // Then
        assertEquals(optionalProduct, actual);
    }
}