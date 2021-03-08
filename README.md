# Sample Java Spring Boot Project with GraphQL and PostgreSQL
It is GraphQL boilerplate project developed on Java Spring Boot. There is a small scenario based on the Real Estate industry. 
There are two fields as Listing and Trade Type. While a listing will have only one Trade Type, a Trade Type may have more than one Listing. It has a One to Many relationship. 
Within the scope of the project, PostgreSQL  which is running on Docker, used for database. 
Code First approach preffered.

* Medium url: https://medium.com/emlakjet/integration-and-using-graphql-on-a-java-spring-boot-project-899f4c4edc53

* run the  "docker-compose up -d" command in the "resources" folder and then run the application.
* Playground url: http://localhost:8010/playground

### Example queries on playground
<img width="1432" alt="Screen Shot 2021-03-07 at 23 03 49" src="https://user-images.githubusercontent.com/47754791/110254579-d5006580-7fa0-11eb-9400-728e06114225.png">
<img width="1432" alt="Screen Shot 2021-03-07 at 23 04 31" src="https://user-images.githubusercontent.com/47754791/110254580-d6ca2900-7fa0-11eb-9bb5-aec477687706.png">
<img width="1432" alt="Screen Shot 2021-03-07 at 23 05 22" src="https://user-images.githubusercontent.com/47754791/110254592-de89cd80-7fa0-11eb-8d08-1419c3b76859.png">
<img width="1432" alt="Screen Shot 2021-03-07 at 23 12 19" src="https://user-images.githubusercontent.com/47754791/110254594-dfbafa80-7fa0-11eb-8e5c-2934a2420341.png">
<img width="1432" alt="Screen Shot 2021-03-07 at 23 12 36" src="https://user-images.githubusercontent.com/47754791/110254596-e0539100-7fa0-11eb-8b45-9aa85a0d40de.png">
<img width="1432" alt="Screen Shot 2021-03-07 at 23 18 07" src="https://user-images.githubusercontent.com/47754791/110254601-e5184500-7fa0-11eb-9fa7-44e041ee57dc.png">
<img width="1432" alt="Screen Shot 2021-03-07 at 23 19 23" src="https://user-images.githubusercontent.com/47754791/110254606-e6497200-7fa0-11eb-8e16-7390e968ffbd.png">
<img width="1432" alt="Screen Shot 2021-03-07 at 23 20 58" src="https://user-images.githubusercontent.com/47754791/110254607-e77a9f00-7fa0-11eb-92ce-0baa9d4f5a7f.png">
<img width="1432" alt="Screen Shot 2021-03-07 at 23 21 49" src="https://user-images.githubusercontent.com/47754791/110254609-e8133580-7fa0-11eb-9eb8-8231eb2c8962.png">

* Voyager extension added, test it with: http://localhost:8010/voyager
![image](https://user-images.githubusercontent.com/47754791/110254628-f9f4d880-7fa0-11eb-8e50-bd257243432c.png)
