package springapp.service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.validation.Validator;
import org.springframework.validation.Errors;

public class PriceIncreaseValidator implements Validator {
    private int DEFAULT_MIN_PERCENTAGE=0;
    private int DEFAULT_MAX_PERCENTAGE=50;
    private int minPercentage=DEFAULT_MIN_PERCENTAGE;
    private int maxPercentage=DEFAULT_MAX_PERCENTAGE;
    protected final Log logger=LogFactory.getLog(getClass());
    public boolean supports(Class clazz){
        return PriceIncrease.class.equals(clazz);
    }
    public void validate(Object obj,Errors errors){
        PriceIncrease pi=(PriceIncrease)obj;
        if(pi==null){
            errors.rejectValue("percentage","error.not-specified",null,"Value requeired.");
        }else {
            logger.info("Validating with"+pi+":"+pi.getPercentage());
            if (pi.getPercentage()>maxPercentage){
                errors.rejectValue("percentage","error.too high",new Object[]{new Integer(maxPercentage)},"value too high.");
            }
            if (pi.getPercentage()<minPercentage) {
                errors.rejectValue("percentage", "error.too low", new Object[]{new Integer(minPercentage)}, "value too low.");
            }
        }
    }
    public void setMinPercentage(int i){
        minPercentage=i;
    }
    public int getMinPercentage(){
        return  minPercentage;
    }
    public void setMaxPercentage(int i){
        maxPercentage=i;
    }
    public int getMaxPercentage(){
        return maxPercentage;
    }
}

