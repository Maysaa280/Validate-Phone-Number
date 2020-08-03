import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateNumber
{
    @Test(description = "Test to validate correct cellphone number")
    public void validateCorrectNumber(){
        Assert.assertTrue(validation.validateSAPhoneNumber("0837077660"));
    }

    @Test(description = "This test validates phone number with country code")
    public void validateCorrectNumberCountryCode(){
        Assert.assertTrue(validation.validateSAPhoneNumber("+27837077660"));
    }

    @Test(description = "Test to validate phone number with country code without +")
    public void validateCorrectNumberCountryCodeWithoutPlus(){
        Assert.assertTrue(validation.validateSAPhoneNumber("27837077660"));
    }

    @Test(description = "Test to validate phone number with invalid numbers")
    public void validateIncorrectNumber(){
        Assert.assertFalse(validation.validateSAPhoneNumber("1234567890"));
    }

    @Test(description = "Test to validate phone number with Alphanumerics")
    public void validateIncorrectNumberAlphaNumeric(){
        Assert.assertFalse(validation.validateSAPhoneNumber("pj*764fsjj@#%"));
    }

    @Test(description = "This test valid phonenumber length with less than 10 numbers")
    public void validateIncorrectNumberLessThanTen(){
        Assert.assertFalse(validation.validateSAPhoneNumber("083707"));
    }

    @Test(description = "This test valid phonenumber length with more than 10 numbers")
    public void validateIncorrectNumberMoreThanTen(){
        Assert.assertFalse(validation.validateSAPhoneNumber("083707766023456"));
    }
}
