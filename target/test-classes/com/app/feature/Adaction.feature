Feature: Testing the Adaction login

Scenario: Validate the Adcation POM Module
Given Enter the URL "https://adactinhotelapp.com/"
When Enter the Username "AbishekP"
And Enter the Password "Jar15@1998"
And Click the login button
And Select the value in Location dropdown "New York"
And Select the value in Hotels dropdown "Hotel Sunshine"
And Select the value in RoomType dropdown "Double"
And Select the value in No.of Rooms dropdown "1"
And Enter the Checkin data "17/03/2026"
And Enter the Checkout date "19/03/2026"
And Select the value in Adults per Room dropdown "2"
And Select the value in Childern per Room dropdown "1"
And Click the search button
And Click the select button
And Click the Continue button
And Enter the First Name "Devipriya"
And Enter the Last Name "Surendhar"
And Enter the Billing Address "Chennai"
And Enter the CC Number "1234567890987654"
And Select the value in CC Type dropdown "VISA"
And Select the Value in Expiry date Month "2"
And Select the Value in Expiry date Year "2028"
And Enter the CVV Number "1234"
Then Click the Book Now button
And Close the Browser



