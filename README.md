# Game-Simulator
This is a multiplayer game. The game is regarding the Stock Market. It simulates the stock market which the users can get an idea of the market by selling and buying stock as per their wish.
![alt text](/stock_simulator/PIC.PNG "")

## Technologies Used:
1. Spring Boot
2. Hibernate
3. Crud Repository
4. Spring boot Sessions
5. JPA
6. SSE (Server Sent Events)

## How to install
First you should configure the Database its (stock_market_sim.sql) and then you should upload it to PHPMYADMIN. We have written the code which has PHPMYADMIN username=root password=root. And then you can import our project using an IDE. Since we used a MAVEN project all the dependencies are automatically updated, once you import the project. The project will load to localhost.

## How to use
Once you uploaded the project. You can load it by typing http://localhost:8080/login then the login page will be prompted as seen below.
![alt text](/stock_simulator/pic2.PNG "")

Or if you are a new user you can register with our game using the register tab.
![alt text](/stock_simulator/pic3.PNG "")

Once logged in you will be prompted to the Main game page. You can view all you details on this page Portfolio, Game history etc.

If you want to enter to an new game you can click on the GAME tab and navigate to the game section. And click the play now button to enter to an game.
![alt text](/stock_simulator/pic4.PNG "")
If no human player exist other than you, you will be automatically be assigned with two Non-Human Players since minimum player count is three. 
