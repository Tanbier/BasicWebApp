package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Tanbier";
        } else { // TODO extend the programm here
            String[] string = query.split("%20");
            int summand1 = 0;
            int summand2 = 0;
            if (string[1].equals("what")) {
                String sum1 = string[3];
                summand1 = Integer.parseInt(sum1);
                String sum2 = string[5];
                summand2 = Integer.parseInt(sum2);
            }
            int sum = summand1 + summand2;
            return String.valueOf(sum);
        }
        }
    }

