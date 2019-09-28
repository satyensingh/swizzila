import java.time.LocalDate;

import com.d2d.bds.eliminate.switchcase.ChangeCase;
import com.d2d.bds.eliminate.switchcase.DOW;
import com.d2d.bds.eliminate.switchcase.KeyCode;
import com.d2d.bds.eliminate.switchcase.with.array.DOWArray;
import com.d2d.bds.eliminate.switchcase.with.file.KeyCodeLoadFromFile;
import com.d2d.bds.eliminate.switchcase.with.function.ChangeCaseFunction;
import com.d2d.bds.eliminate.switchcase.with.hashtable.KeyCodeHashtable;

public class Swizilla {

	public static void main(String[] args) throws Exception {

		// value replace switch (fixed)
		System.out.println(DOW.dayOfWeek(1));
		System.out.println(DOWArray.dayOfWeek(1));
		
		// value replace switch (dynamic over time)
		System.out.println(KeyCode.getKeyMap(38));		
		System.out.println(KeyCodeHashtable.getKeyMap(38));
		System.out.println(KeyCodeLoadFromFile.getKeyMap(38));
		
		
		// value action switch
		System.out.println(ChangeCase.convert(ChangeCase.Case.Camel, new String[] { "Numeric", "Value" }));
		System.out.println(ChangeCaseFunction.convert(ChangeCaseFunction.Case.Kebab, new String[] { "Numeric", "Value" }));
		
		// value action if-else ladder
		System.out.println(Math.round(Billing.calculateTariff(274) *100.00)/100.00);
	
		// varied condition if-else ladder
        Customer anders = new Customer("James Gosling", LocalDate.of(2017,  07,  07), LocalDate.of(2017, 10, 5), LocalDate.of(1955, 5, 19));
        System.out.println(anders);
        System.out.println (CustomerDiscount.calculateDiscount(anders)*100+"%");
        
        // Multiple switch-case statements
        Account dmr = new Account(Account.Type.SavingsAccount, 1, "Dennis M. Ritchie", 1000);
        System.out.println(dmr);
        dmr.withdraw(500);
        System.out.println(dmr);
        dmr.deposit(10000);
        System.out.println(dmr);

        // Dynamically creating object of a type
        Circle circle = (Circle)ShapeCreator.newShape("circle");
        circle.centerPoint = new Point(10, 10);
        circle.radius = 10;
        System.out.println(circle.calculateArea());

        Rectangle rectangle = (Rectangle)ShapeCreator.newShape("rectangle");
        rectangle.startPoint = new Point(10, 10);
        rectangle.endPoint = new Point(20, 20);
        System.out.println(rectangle.calculateArea());
        

	}

}
