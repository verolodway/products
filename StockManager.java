import java.util.ArrayList;
import java.util.Iterator;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    // Cantidad de productos en el stock
    private int cantidad;
    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
        int cantidad = 0;
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }

    /**
     * Receive a delivery (entrega, distribucion, presentacion) of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Iterator<Product> produ = stock.iterator();
        while (produ.hasNext()){
            Product stock = produ.next();
            if(stock.getID() == id){
                cantidad = stock.getQuantity()+ amount;
            }
            else{
                cantidad = 0;
            }
        }
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        Product productoEncontrado = null;
        Iterator<Product> prod = stock.iterator();
        while (prod.hasNext()){
            Product stock = prod.next();
            if (stock.getID() == id){
                productoEncontrado = stock;
            }
        }
        return productoEncontrado;
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    { 
        Iterator<Product> produ = stock.iterator();
        int cantidad = 0;
        while (produ.hasNext()){
            Product stock = produ.next();
            if (stock.getID() == id){
                cantidad = stock.getQuantity();
            }
        }
        return cantidad;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        for (Product producto : stock){
            System.out.println(stock);
        }
    }
}
