/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package separticleapp;
import javax.swing.JOptionPane;
/**
 *
 * @author danma
 */
public class SEPArticleApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SEPArticleApp article = new SEParticleApp();
        article.setVisible(true);
        //Article is an extract from an existing UN article that has been paraphrased, the extrat can be found @ https://sdgs.un.org/goals/goal2#progress_and_info
        article.setArticleText("Since 2015, there has been a rise in the number of people experiencing hunger and food insecurity, which can be attributed to a variety of factors such as the pandemic, conflicts, climate change, and growing inequalities. In 2015, there were 589 million people living in hunger; by 2021, that number had risen to 768 million. Projections indicate that by 2030, there will still be approximately 670 million people facing hunger, which equates to 8% of the world's population and represents the same amount as in 2015. Despite international efforts, a significant number of children continue to suffer from malnutrition, and the current annual rate of reduction in stunting must increase by 2.2 times to meet the global target. In order to achieve zero hunger by 2030, immediate and intensified efforts must be made to transform food systems, ensure food security, and invest in sustainable agricultural practices.");
    }
    
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    
    
    public SEPArticleApp(){
        name = "";
        surname = "";
        phoneNumber = "";
        email = "";
    }
    
    public SEPArticleApp(String name, String surname, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname (String surname) {
        this.surname = surname;
    }
    
    public String getphoneNumber() {
        return phoneNumber;
    }
    
    public void setphoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public String getDetails(){
        return "Newsletter subscriber details: " + name ", " + surname ", " + phoneNumber ", " + email;
    }
    
    public void () {
    JOptionPane.showMessageDialog(null, "Subscription was successful for: " + email + "You will recieve a confirmation email shortly");
    
    }
}
