package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Database {
    public Connection conn;
    private Statement stm;

    /**
     * sets connection to database
     */
    public Database(){
        String username = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/stock data?useSSl=false",
                    username, password);
            stm = conn.createStatement();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    /**
     * adds data to the database
     * @param name name of the data
     * @param qty the quantity of the data
     */
    public void addstock(String name, int qty){
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO stock VALUES(Null,?,?)");
            ps.setString(1, name);
            ps.setInt(2, qty);
            ps.executeUpdate();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * deletes the database
     * @param id selects the id to delete
     */

    public void deletestock(int id){
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM stock WHERE ID = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /**
     * Takes the data from the database and put it in an array
     * @return
     */
    public ArrayList<Stocks> getstock(){
        ArrayList<Stocks> result = new ArrayList();
        Statement s = null;
        try {
            s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM stock");
            while (rs.next()) {
                result.add(new Stocks(rs.getInt(1), rs.getString(2),
                        rs.getInt(3)));
            }
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
        return result;
    }

    /**
     * updates or changes the name on the database by searching  its id
     * @param name new name
     * @param id the id to update
     */
    public void updatestockname(String name, int id){
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE stock SET `name` = ? WHERE id = ?");
            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    /**
     * updates or changes the qty on the database by searching its id
     * @param id the id to update
     * @param qty new qty
     */
    public void updatestockQTY(int id,int qty){
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE stock SET `qty` = ? WHERE id = ?");
            ps.setInt(1, qty);
            ps.setInt(2, id);
            ps.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}

