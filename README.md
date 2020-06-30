# Stress-App-Android-

I was tasked with creating an android application to be used by a student completing her Masters in Psychology(the client). The app would form part of her final task for the year

The client had spoken to her supervisor at the University of the Witwatersrand and the app would have to be complete before the end of year.
The original timeline was from July 2019 - Septeber 2019 however she had to first obtain proper permission from the Wits Counselling and Careers Development Unit in order to secure funding and establish a scope for the project.
This led to an adapted timeline with the project starting in September and being delivered on 9 October 2019. Payment was delayed due to the start of the new year and as of June 2020 no payment has been made due to the Covid-19 break out.
Currently the Wits Office of Student Success on Med Campus has expressed interest in purchasing the app however due to the above mentioned reasons, no final offer has been made.

The student has now graduated with her Masters and has claimed the app has worked as expected.

## Issues faced during development:
* The significantly reduced time to develop had led to me rush to design an app that was functional rather than one that followed best     practice.
* Maintenance had not been bore in mind due to the time available.
* My knowledge of Android at a basic level was solid however the app required a database and as my university course had only briefly touched on this, I had to learn many concepts and topics during development.
* Each screen consists of ImageButtons as the client had requested a strict format and appearance and as I did not have the time to learn html, I was left with no other avenue.
* The app was developed to run on many devices so the images could not be made high-res without affecting performance.
* Names of classes, variables, images and database fields are not well thought out again due to the rushed timeline.
* There was a network aspect of the app whereby users would have a newsboard unique to them however this was cut due to the university not willing to pay for server costs and the drastically reduced timeline.
* The screen whereby users may interact with their personal timetable was exceptionally interesting and enjoyable to code due to it providing the most challenge. This section of the app required significant database and SQL knowledge. Initially the screen was implemented in a way whereby the user would not be able to edit a task once it was input into the timetable. The client however wanted each task to be editable so I changed it so that each field became an editText instead and the user would be required to then press a button which would update the entire table. The client was still not happy with the extra step so I had designed each task to be a distinguishable element rather than simply one long editText and thus when a user did a long press on the status of the task. I still had the issue of users making changes but not saving their changes so I ran a quick loop to 'press' all buttons on the screen closing. 
* The client and I communicated via email and whatsapp so I had to constantly review completed work product to meet the clients requirement.
