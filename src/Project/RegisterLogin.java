package Project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterLogin {
	
	private static LocalDateTime purchaseTime;

	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	     List<Member> members = new ArrayList<>();
		    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy | hh:mm a");

	     Member LoggedInUser = null;
	        
	        System.out.println("╔═════════════════════════════════════════════════════════════════╗");
	        System.out.println("║               💪 WELCOME TO TITAN GYM 💪                        ║");
	        System.out.println("╠═════════════════════════════════════════════════════════════════╣");
	        System.out.println("║ Gym ID        : GYM101                 🏋️   ====   ====         ║");
	        System.out.println("║ Location      : Pune, Maharashtra      🏋️    ||     ||          ║");
	        System.out.println("║ Owner         : Mr. Tanmay Narawade    🏋️   ====   ====         ║");
	        System.out.println("║ Contact       : +91-9876543210                                  ║");
	        System.out.println("║ Timings       : 🕕 6:00 AM  -  10:00 PM                         ║");
	        System.out.println("║ Facilities    : 🏃 Cardio | 🏋 Strength | 🤸 CrossFit | 🧘 Yoga ║");
	        System.out.println("╚═════════════════════════════════════════════════════════════════╝");
	        System.out.println();
	        System.out.println("       Welcome! Get ready to crush your fitness goals today! 💪");


	        
	        while(true) {
	        	
	        System.out.println("1.Register \t 2.Login \t3.Exit" );
	        int reg=s.nextInt();
	        
	        switch(reg)
	        {
	        		case 1: System.out.println("Enter your name");
	        				String name = s.next();
	        				System.out.println("Enter Gender");
	        				String gender = s.next();
	        				System.out.println("Enter Contact No");
	        				String no=s.next();
	        				System.out.println("Enter Username");
	        				String username=s.next();
	        				System.out.println("Enter Email");
	        				String email=s.next();
	        				System.out.println("Enter password");
	        				String pass = s.next();
	        				System.out.println("Enter age");
	        				int age=s.nextInt();
	        
	        Member newUser = new Member(name,gender,no,username,email,pass,age);
	        
	        members.add(newUser);
	        	System.out.println();
	        System.out.println("╔════════════════════════════════════════════════╗");
	        System.out.println("║           🎉 REGISTRATION SUCCESSFUL 🎉        ║");
	        System.out.println("╠════════════════════════════════════════════════╣");
	        System.out.println("║      Welcome to TITAN GYM FAMILY 🏋️‍♂️💪          ║");
	        System.out.println("║        Get ready to achieve your goals!        ║");
	        System.out.println("╚════════════════════════════════════════════════╝");
	        System.out.println();
	        break;

	        
	        		case 2: System.out.println("Enter Username");	
	        				String LoginUsername = s.next();
	        				System.out.println("Enter Password");
	        				String LoginPass=s.next();
	        	
	        	boolean LoggedIn = false;
	        	for(Member user : members)
	        	{
	        		if(user.getUsername().equals(LoginUsername) && user.getPassword().equals(LoginPass)) {
	        			System.out.println();
	        			System.out.println("╔════════════════════════════════════════════════╗");
	        			System.out.println("║              🔐 LOGIN SUCCESSFUL ✅            ║");
	        			System.out.println("╠════════════════════════════════════════════════╣");
	        			System.out.println("║   Welcome , " + user.getName() + "! 💪                    ║");
	        			System.out.println("║   Great to see you again at TITAN GYM 🏋️‍♂️       ║");
	        			System.out.println("╚════════════════════════════════════════════════╝");
	        			System.out.println();

	        			LoggedInUser = user;
	        			LoggedIn = true;
	        			break;
	        		}
	        	}
	        		if(!LoggedIn) {
	        			System.out.println("Login Failed. Invalid username or password");
	        	}
	        	while(LoggedInUser != null)
	        	{
	        		System.out.println();
	        		System.out.println("╔════════════════════════════════════════════════════════════╗");
	        		System.out.println("║                    💪 MAIN MENU 💪                          ║");
	        		System.out.println("╠════════════════════════════════════════════════════════════╣");
	        		System.out.println("║  Welcome, " + LoggedInUser.getName().toUpperCase() + "!                           ║");
	        		System.out.println("╠════════════════════════════════════════════════════════════╣");
	        		System.out.println("║  [1]  BMI Calculator                                       ║");
	        		System.out.println("║  [2]  View Membership Plans                                ║");
	        		System.out.println("║  [3]  View Diet Plans                                      ║");
	        		System.out.println("║  [4]  Logout                                               ║");
	        		System.out.println("╚════════════════════════════════════════════════════════════╝");
	        		System.out.print("👉 Enter your choice: ");


	        		
	        		int menuChoice = s.nextInt();
	        		switch(menuChoice) {
	        		
	        				case 1: System.out.println("\n--- BMI Calculator ---");
	        						System.out.println("Enter Your Weight in kg");
	        						double weight = s.nextDouble();
	        						System.out.println("Enter Your height in meters (e.g., 1.75):");
	        						double height = s.nextDouble();
	        			
	        			if(height > 0) {
	        					double bmi = weight / (height * height);

	        					System.out.println("╔════════════════════════════════════╗");
	        					System.out.printf ("║        💪 Your BMI is: %.2f 💪     ║%n", bmi);
	        					System.out.println("╚════════════════════════════════════╝");

	        				

		        				System.out.println("╔════════════════════════════════════════════╗");
		        				System.out.println("║             BMI INTERPRETATION             ║");
		        				System.out.println("╠════════════════════════════════════════════╣");

	        				if (bmi < 18.5) {
	        				    System.out.println("║ Interpretation: Underweight                  ║");
	        				    System.out.println("╠══════════════════════════════════════════════╣");
	        				    System.out.println("║ ⚠️ Diet Suggestion:                          ║");
	        				    System.out.println("║ - Focus on nutrient-dense foods              ║");
	        				    System.out.println("║ - Include healthy fats: avocado, nuts        ║");
	        				    System.out.println("║ - Protein shakes & complex carbs (oats, rice)║");
	        				} else if (bmi >= 18.5 && bmi < 25) {
	        				    System.out.println("║ Interpretation: Normal weight                ║");
	        				    System.out.println("╠══════════════════════════════════════════════╣");
	        				    System.out.println("║ ✅ Maintain a balanced diet                  ║");
	        				    System.out.println("║ ✅ Regular exercise: cardio + strength       ║");
	        				    System.out.println("║ ✅ Keep hydrated and track your progress     ║");
	        				} else if (bmi >= 25 && bmi < 30) {
	        				    System.out.println("║ Interpretation: Overweight                   ║");
	        				    System.out.println("╠══════════════════════════════════════════════╣");
	        				    System.out.println("║ ⚠️ Suggested Actions:                        ║");
	        				    System.out.println("║ - Reduce sugary and processed foods          ║");
	        				    System.out.println("║ - Increase cardio and strength training      ║");
	        				    System.out.println("║ - Eat more vegetables, lean protein          ║");
	        				} else {
	        				    System.out.println("║ Interpretation: Obesity                      ║");
	        				    System.out.println("╠══════════════════════════════════════════════╣");
	        				    System.out.println("║ ⚠️ Suggested Actions:                        ║");
	        				    System.out.println("║ - Consult a nutritionist or trainer          ║");
	        				    System.out.println("║ - Strictly follow a healthy diet plan        ║");
	        				    System.out.println("║ - Combine cardio, strength & flexibility     ║");
	        				}

	        			
	        			} else {
	        				System.out.println("Height must be greater than 0.");
	        			}break;
	        			
	        			case 2: 
	        				
	        				while(true) {
	       
		        				    System.out.println();
		        				    System.out.println("╔════════════════════════════════════════════════════════════════╗");
		        				    System.out.println("║                 💳 OUR MEMBERSHIP PLANS 💳                     ║");
		        				    System.out.println("╠════════════════════════════════════════════════════════════════╣");
	        				        System.out.println("║ [1] 🥉 Bronze Plan - ₹1,600/month                              ║");
	        				        System.out.println("║      → Access to Cardio and Weight Training Zones.             ║");
	        				        System.out.println("║                                                                ║");
	        				        System.out.println("║ [2] 🥈 Silver Plan - ₹2,800/month                              ║");
	        				        System.out.println("║      → Includes Bronze + Unlimited Group Classes.              ║");
	        				        System.out.println("║                                                                ║");
	        				        System.out.println("║ [3] 🥇 Gold Plan - ₹4,000/month                                ║");
	        				        System.out.println("║      → Includes Silver + 1 Personal Training Session/Week.     ║");
	        				        System.out.println("║                                                                ║");
	        				        System.out.println("║ [4] 🚪 No Thanks                                               ║");
	        				        System.out.println("╚════════════════════════════════════════════════════════════════╝");

	        				System.out.print("👉 You want to buy which Membership Plan (1/2/3/4)? ");
	        		        String membership = s.next();

	        		        if (membership.equals("4")) {
	        		            System.out.println("🙏 No worries! ");
	        		            break;
	        		        }
	        		        LocalDate startDate = LocalDate.now();               
	        		        LocalDate expiryDate = startDate.plusMonths(1);       

	        		        format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	        		        String planName = "";
	        		        String planPrice = "";

	        		        switch (membership) {
	        		            case "1":
	        		                planName = "🥉 Bronze Plan";
	        		                planPrice = "₹1,600/month";
	        		                break;
	        		            case "2":
	        		                planName = "🥈 Silver Plan";
	        		                planPrice = "₹2,800/month";
	        		                break;
	        		            case "3":
	        		                planName = "🥇 Gold Plan";
	        		                planPrice = "₹4,000/month";
	        		                break;
	        		           
	        		            default:
	        		                System.out.println("❌ Invalid choice! Please select 1, 2, or 3.");
	        		                s.close();
	        		                return;
	        		        }

	        		        System.out.println();
	        		        System.out.println("╔════════════════════════════════════════════════════════════════╗");
	        		        System.out.printf ("║ ✅ You selected: %-45s ║%n", planName);
	        		        System.out.printf ("║ 💰 Price: %-51s ║%n", planPrice);
	        		        System.out.printf ("║ 📅 Start Date: %-46s ║%n", startDate.format(format));
	        		        System.out.printf ("║ ⏳ Expiry Date: %-45s ║%n", expiryDate.format(format));
	        		        System.out.println("╚════════════════════════════════════════════════════════════════╝");
	        		        System.out.println("🎉 Thank you for joining our gym! Stay strong and consistent! 💪");

	        				}
	        				    	break;
	        			case 3:
	        				System.out.println("╔══════════════════════════════════════════════════════════════════╗");
	        				System.out.println("║                      🥗 SAMPLE DIET PLANS 🥗                     ║");
	        				System.out.println("╠══════════════════════════════════════════════════════════════════╣");
	        				System.out.println("║ 🔸 For Overweight:                                               ║");
	        				System.out.println("║     → Focus on lean proteins (chicken, fish), lots of veggies,   ║");
	        				System.out.println("║       and whole grains.                                          ║");
	        				System.out.println("║     → Avoid sugary drinks and processed foods.                   ║");
	        				System.out.println("╠──────────────────────────────────────────────────────────────────╣");
	        				System.out.println("║ 🔹 For Underweight:                                              ║");
	        				System.out.println("║     → Focus on nutrient-dense foods like avocado, nuts,          ║");
	        				System.out.println("║       protein shakes, and complex carbs (oats, brown rice).      ║");
	        				System.out.println("║     → Eat 5–6 small meals throughout the day.                    ║");
	        				System.out.println("╠──────────────────────────────────────────────────────────────────╣");
	        				System.out.println("║ 🔹 For Normal Weight:                                            ║");
	        				System.out.println("║     → Maintain a balanced diet:                                  ║");
	        				System.out.println("║         • Breakfast: Oats or eggs with fruit                     ║");
	        				System.out.println("║         • Lunch: Brown rice or roti with dal, veggies, salad     ║");
	        				System.out.println("║         • Dinner: Grilled paneer/chicken + soup or salad         ║");
	        				System.out.println("║     → Stay hydrated (2–3L water daily).                          ║");
	        				System.out.println("║     → Exercise regularly (30–45 mins daily).                     ║");
	        				System.out.println("╚══════════════════════════════════════════════════════════════════╝");

	        				break;
	        				
	        			case 4:
	        				System.out.print("\n❓ Do you really want to exit? (yes/no): ");
	        				String choice = s.next().trim().toLowerCase();

	        				if (choice.equals("yes") || choice.equals("y")) {
	 
	        				    LocalDateTime now = LocalDateTime.now();
	        				    String formattedDateTime = now.format(format);

	        				    System.out.println();
	        				    System.out.println("╔══════════════════════════════════════════════════════════╗");
	        				    System.out.println("║                  👋 YOU HAVE BEEN LOGGED OUT             ║");
	        				    System.out.println("╠══════════════════════════════════════════════════════════╣");
	        				    System.out.println("║   User: " + LoggedInUser.getName());                     
	        				    System.out.println("║   Date & Time: " + formattedDateTime);
	        				    System.out.println("║----------------------------------------------------------║");
	        				    System.out.println("║   Thank you for being part of TITAN GYM 🏋️‍♂️💪             ║");
	        				    System.out.println("║   Stay fit, stay strong, and come back soon!             ║");
	        				    System.out.println("╚══════════════════════════════════════════════════════════╝");
	        				    LoggedInUser = null;
	        				    System.exit(0);
	        				} else {
	        				    System.out.println("\n💪 Awesome! Returning to Main Menu...\n");
	        				}
	        				  
	        				break;
	        				
	        			default:
	        				System.out.println("Invalid choice, please try again.");
	        				break;
	        					
	        		}
	        	}
	        	break;
	        	
	        case 3:
	        	System.out.println("Thank you for using the Gym Management System. Goodbye!");
	        	s.close();
	        	return;
	        
	        	default: 
	        		System.out.println("Invalid option. Please choose again");
	        		break;
	        
	        }
	        }
	        
	}
}