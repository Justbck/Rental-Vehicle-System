
package rental_vehicle_system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class VehicleTable extends JFrame{
    
    private JTable myTable;
    private JFrame frame;
    private VehicleTableModel tableModel;
    private ArrayList<Vehicle> vehicleList;
    protected JButton buttonSearch = new JButton("Search");
    protected JTextField textSearch  = new JTextField();
	
    DefaultTableModel dtm;

    
    // contructor
    public VehicleTable(ArrayList<Vehicle> vehiclelist){
        this.vehicleList = vehiclelist;
        
        
        
        tableModel = new VehicleTableModel(vehicleList);
        myTable =  new JTable(tableModel);
        
 
        getContentPane().setBackground(new Color(100, 100, 100));
        setBounds(100, 100, 1079, 546);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        
     
        myTable.setAutoCreateRowSorter(true);
        
        // color code the type of person: if it is a teacher is green, if student is blue
        myTable.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer(){
                Color originalColor = null;

                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            
                Component renderer =  super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (value == "Motorbike") {
                renderer.setBackground(new Color(200, 200, 200));
            } else {
                renderer.setBackground(new Color(200, 200, 200));
            }

           
            return renderer;
        }
});
        


      
         JScrollPane scrollPane = new JScrollPane(myTable); 
         scrollPane.setPreferredSize(new Dimension(780,400)); 
        
       JPanel panel = new JPanel(); 
       panel.add(scrollPane); 
       add(panel,BorderLayout.CENTER); 
          
       // panel.setLayout(new FlowLayout(FlowLayout.CENTER));
       panel.add(buttonSearch);
       buttonSearch.setBounds(127, 35, 11, 20);
               
       textSearch.setBounds(127, 50, 11, 20);
       panel.add(textSearch);
       textSearch.setColumns(10);
       
       UtilDateModel model = new UtilDateModel();
      
       //JDatePanelImpl datePanel = new JDatePanelImpl(model);
       //JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
       //frame.add(datePicker);
     
          

       

       
        
    }
    
    
}
