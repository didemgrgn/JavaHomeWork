package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap mernisValidation = new KPSPublicSoapProxy();

		try {
			mernisValidation.TCKimlikNoDogrula(Long.parseLong("288614"), "Didem", "Girgin", "1995");
		} catch (Exception e) {
			
		}
		
		try {
			
			if (mernisValidation.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirsName(), customer.getLastName(), customer.getBirthDate())) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}
		
	}

@Override
public boolean CheckIfRealPerson(Customer customer) {
	// TODO Auto-generated method stub
	return false;
}
	
}