import org.openqa.selenium.chrome.ChromeDriver

waiting{

    timeout=2
    retryInterval=0.5
    includeCauseInMessage=true
    preset{
            slow{
                timeout=20
                retryInterval=1
            }
        verySlow{ timeout=50}

    }

}
atCheckWaiting="slow"

driver={new ChromeDriver()}

environments{


}
baseUrl="https://www.westernunion.com/us/en"
reportsDir="./target/report"


