package br.com.everymind.nunessports.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super("Não foi possível encontrar o produto com ID " + id);
    }
}
