package com.example.shop;

import com.example.shop.shop.domain.ProductEntity;
import com.example.shop.shop.domain.TransferEntity;
import com.example.shop.shop.dto.Product;
import com.example.shop.shop.repositories.ProductRepository;
import com.example.shop.shop.repositories.TransferRepository;
import com.example.shop.shop.services.OrderService;
import com.example.shop.shop.services.ProductService;
import com.example.shop.shop.services.ProductServiceImpl;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShopApplication {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private TransferRepository transferRepository;

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);

	}

	@Bean
	InitializingBean sendDatabase() {
		return () -> {
			productRepository.save(ProductEntity.builder()
					.name("Niebieska koszula")
					.description("Uszyta z mieszanki bawełny i lnu koszula z delikatnym wzorem w tej samej tonacji to klasyczny element Twojej garderoby.")
					.price(99.0)
					.imageURL("https://tommy-europe.scene7.com/is/image/TommyEurope/MW0MW12787_C39_main?$main@2x$")
					.build());
			productRepository.save(ProductEntity.builder()
					.name("Różowa koszula")
					.description("Ta koszula uszyta z lekkiej i przewiewnej mieszanki bawełny z lnem będzie idealnym dopełnieniem eleganckich, wiosennych strojów.")
					.price(205.0)
					.imageURL("https://tommy-europe.scene7.com/is/image/TommyEurope/MW0MW12761_TOS_main?$main@2x$")
					.build());
			productRepository.save(ProductEntity.builder()
					.name("Ciemna koszula")
					.description("Uszyta z mieszanki bawełny i lnu koszula z delikatnym wzorem w tej samej tonacji to klasyczny element Twojej garderoby.")
					.price(159.0)
					.imageURL("https://tommy-europe.scene7.com/is/image/TommyEurope/MW0MW12787_C7H_main?$main@2x$")
					.build());
			productRepository.save(ProductEntity.builder()
					.name("Zielona koszula")
					.description("Ta koszula uszyta z lekkiej i przewiewnej mieszanki bawełny z lnem będzie idealnym dopełnieniem eleganckich, wiosennych strojów.")
					.price(159.0)
					.imageURL("https://tommy-europe.scene7.com/is/image/TommyEurope/MW0MW12761_L9F_main?$main@2x$")
					.build());
			productRepository.save(ProductEntity.builder()
					.name("Hawajka koszula")
					.description("Wszystkie elementy kolekcji Big & Tall idealnie dopasują się do Twojej sylwetki – zostały uszyte z myślą o osobach wysokich i noszących większe rozmiary.")
					.price(159.0)
					.imageURL("https://tommy-europe.scene7.com/is/image/TommyEurope/MW0MW15361_0GY_main?$main@2x$")
					.build());
			productRepository.save(ProductEntity.builder()
					.name("Biała koszula")
					.description("Ta koszula uszyta z lekkiej i przewiewnej mieszanki bawełny z lnem będzie idealnym dopełnieniem eleganckich, wiosennych strojów.")
					.price(159.0)
					.imageURL("https://tommy-europe.scene7.com/is/image/TommyEurope/MW0MW12761_YBR_main?$main@2x$")
					.build());
			productRepository.save(ProductEntity.builder()
					.name("Granatowa koszula")
					.description("Klasyczna letnia koszula powraca w wyrafinowanym wydaniu – została uszyta z lekkiego lnu, ma wąski krój, elegancki kołnierzyk i mankiety zapinane na guziki.")
					.price(259.0)
					.imageURL("https://tommy-europe.scene7.com/is/image/TommyEurope/TT0TT06795_DW4_main?$main@2x$")
					.build());
			transferRepository.save(TransferEntity.builder()
					.name("Super sklep z koszulami")
					.accountNumber("27 1140 2004 0000 3002 0135 5387")
					.title("Zamówienie nr ")
					.build());
		};
	}
}
