package entities;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;


public class MailDemo {

	public static void main(String[] args) {
		
		
		Set<Mail> mail = new TreeSet<Mail>();
		mail.add(new Mail(102L, "xyz","sahaj","hiii",LocalDateTime.of(2021,1,1,1,20)));
		mail.add(new Mail(103L, "abc","collection","byee",LocalDateTime.of(2013,7,5,3,45)));
		mail.add(new Mail(103L, "mnc","set","java",LocalDateTime.of(2011,12,19,6,20)));
		mail.add(new Mail(104L, "pqr","treeset","object",LocalDateTime.of(2001,3,19,8,20)));
		mail.add(new Mail(105L, "ghi","hashset","class",LocalDateTime.of(1997,9,2,2,20)));
		
		for(Mail m : mail) {
			System.out.println(m);
		}
		System.out.println();
		
	}

}
