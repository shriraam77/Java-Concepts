package rough_space;

import java.util.ArrayList;
import java.util.Arrays;

public class RoughSpace2 
{
	public static void main(String[] args) {
		
		ArrayList<String> countryCodes = new ArrayList<>(Arrays.asList(
	            "AD", "AE", "AG", "AI", "AL", "AM", "AO", "AR", "AS", "AT",
	            "AU", "AW", "AZ", "BA", "BB", "BE", "BF", "BG", "BH", "BI",
	            "BJ", "BM", "BN", "BO", "BR", "BS", "BT", "BW", "BY", "BZ",
	            "CA", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN",
	            "CO", "CR", "CU", "CV", "CY", "CZ", "DE", "DJ", "DK", "DM",
	            "DO", "DZ", "EC", "EE", "EG", "ER", "ES", "ET", "FI", "FJ",
	            "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG",
	            "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GT", "GU",
	            "GW", "GY", "HK", "HN", "HR", "HT", "HU", "IC", "ID", "IE",
	            "IL", "IN", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP",
	            "KE", "KG", "KH", "KI", "KM", "KN", "KP", "KR", "KV", "KW",
	            "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT",
	            "LU", "LV", "LY", "MA", "MC", "MD", "MG", "MH", "MK", "ML",
	            "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV",
	            "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NG", "NI", "NL",
	            "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG",
	            "PH", "PK", "PL", "PR", "PT", "PW", "PY", "QA", "RE", "RO",
	            "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH",
	            "SI", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV",
	            "SY", "SZ", "TC", "TD", "TG", "TH", "TJ", "TL", "TM", "TN",
	            "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "US", "UY",
	            "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WS", "XB",
	            "XC", "XE", "XM", "XN", "XS", "XY", "YE", "YT", "ZA", "ZM", "ZW"
	        ));
		
		String sql = " UPDATE COUNTRY SET REF_FIELD1 = 'Y' WHERE COUNTRY_CD = '$CODE$' ; " ;
		String result ;
		int cnt = 1;
		for(int i=0; i<countryCodes.size() ; i++ )
		{
			result = sql.replace("$CODE$", countryCodes.get(i));
			
			//System.out.println(cnt++);
			System.out.println(result);
		}
		
	}
}


