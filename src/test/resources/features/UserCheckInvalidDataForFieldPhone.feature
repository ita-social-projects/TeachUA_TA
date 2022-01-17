Feature: Verify that error messages are shown and 'Зберегти зміни' button becomes disabled

  Scenario Outline: This test case verify that error messages are shown and 'Зберегти зміни' button becomes disabled while entering invalid data for the 'Телефон' field

    Given Log in as an Керівник email = <email>, password = <password>
    Then Click on owner profile popup
    And Click on profile
    Then Click on Edit profile
    And Fill invalid data in field <fieldPhone> check if the <message> is shown
    Examples:
      | email             | password | fieldPhone                                                                                                                                                                  | message                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
      | "admin@gmail.com" | "admin"  | 4352,65987458,6593859632586,jngeoлщшогнеп,!96397180,@96397180,#96397180,$96397180,%96397180,^96397180,&96397180,*96397180,(96397180,_96397180,+96397180,.96397180,:96397180 | Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не може містити літери,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Телефон не відповідає вказаному формату,Будь ласка введіть Ваш номер телефону |
