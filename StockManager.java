import java.util.ArrayList;
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
        for (Product prod : stock){
            prod.getID();
            if(prod.getID() == item.getID()){
                System.out.println("Este ID ya pertenece a un producto.");
            }
            else{
                stock.add(item);
            }
        }
    }

    /**
     * Receive a delivery (entrega, distribucion, presentacion) of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product producto = findProduct(id);
        if(producto != null) {
            producto.increaseQuantity(amount);
        }
        else
        {
            System.out.println("El ID introducido no se corresponde con ningun producto.");
        }
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        Product producto = null;
        boolean encontrado = false;
        int cont = 0;
        while(cont < stock.size() && !encontrado)
        {
            if (stock.get(cont).getID() == id)
            {
                producto = stock.get(cont);
                encontrado = true;
            }
            cont++;
        }
        return producto;
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
        Product producto = findProduct(id);
        int stockDelItem = 0;
        if(producto != null) {
            stockDelItem = producto.getQuantity();
        } 
        return stockDelItem;
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

    /**
     * Método que imprime por pantalla los objetos que están por debajo de un stock determinado por parámetro.
     */
    public void underGivenNumberStock(int numeroDeStock){
        for(Product produc : stock){
            produc.getQuantity();
            if (produc.getQuantity() < numeroDeStock){
                System.out.println(produc.toString());
            }   
        }
    }
    
    /**
     * Método que nos permite encontrar un producto por su nombre
     */
    public Product findProduct(String name){
        Product producto = null;
        boolean encontrado = false;
        int cont = 0;
        while(cont < stock.size() && !encontrado)
        {
            if (stock.get(cont).getName() == name)
            {
                producto = stock.get(cont);
                encontrado = true;
            }
            cont++;
        }
        return producto;
    }
}
