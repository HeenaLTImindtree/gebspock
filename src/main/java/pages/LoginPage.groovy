package pages

import geb.Page

class LoginPage extends Page{
    static url="https://www.westernunion.com/us/en/home.html"

    static  at={
        title=="Send and Track Money Online Now | Western Union"
        //$("title",0).isDisplayed()
    }
static  content = {
    loginField(wait: true){ $("a#wu-mobile-login-button")}
    emailField(wait:true){$ ("input#txtEmailAddr")}
    passField(wait:true){$("input#txtKey")}
    continueField(wait:true){$("button#button-continue")}
    popupfield(wait:true) {
        $("span.wu-icon__lg.d-L-flex.icon-F09-Cross-Remove-Close-Cancel-NoCircle-30px")
    }

}
    def "clicking on login page"(){
        if (popupfield.isDisplayed())
        {
            popupfield.click()
        }


        loginField.click(

        )

    }

    def "enter email"(emailString){
        emailField.value(emailString)
        assert  emailField.value()==emailString


    }
    def "enter pass"(passString){
        passField.value(passString)
        assert  passField.value()==passString


    }
    def "click on continue"(){
continueField.click()
    }

}
