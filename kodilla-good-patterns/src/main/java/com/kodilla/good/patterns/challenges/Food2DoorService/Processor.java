package com.kodilla.good.patterns.challenges.Food2DoorService;
public class Processor {
    private ShopInterface shopInterface;
    private InfoService infoService;
    private ProductRepository productRepository;

    public Processor(final ShopInterface shopInterface,final InfoService infoService, final ProductRepository productRepository) {
        this.shopInterface = shopInterface;
        this.infoService = infoService;
        this.productRepository = productRepository;
    }
    public ProductDto process(final ProductRequest productRequest){
        boolean isDone= shopInterface.process(productRequest.getClient(),productRequest.getProduct());
        if(isDone) {
            infoService.info(productRequest.getClient(),shopInterface);
            productRepository.createProduct(productRequest.getClient(), productRequest.getProduct(),shopInterface);
            return new ProductDto(productRequest.getClient(), true);
        } else {
            return new ProductDto(productRequest.getClient(),false);
        }
    }
}