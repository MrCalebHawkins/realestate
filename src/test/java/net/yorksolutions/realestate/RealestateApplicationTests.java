package net.yorksolutions.realestate;

import net.yorksolutions.realestate.controller.RealEstateController;
import net.yorksolutions.realestate.model.RealEstate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RealestateApplicationTests {

    @Autowired
    private RealEstateController controller;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    void realEstateControllerLoads() {
        assertThat(controller).isNotNull();

    }

    @Test
    void realEstateGetAll() {
        RealEstate[] realEstates = restTemplate.getForObject("http://localhost:" + port + "/realestate/all", RealEstate[].class);
        assertThat(realEstates).isNotNull();
        assertThat(realEstates).isNotEmpty();

    }

    @Test
    void realEstateGetByRows() {
        RealEstate[] realEstatesByRows = restTemplate.getForObject("http://localhost:" + port + "/realestate/getByRowAmount?rows=5", RealEstate[].class);
        assertThat(realEstatesByRows).isNotNull();
        assertThat(realEstatesByRows).isNotEmpty();

//        assertThat(realEstatesByRows.length == 1);
//        These are the same bottom is better Checking for 1 row?
//        assertThat(realEstatesByRows).hasSize(1);
//

    }

    @Test
    void searchTest() {
        String baseUrl = "http://localhost:" + port + "/realestate/";
        RealEstate[] realEstates = restTemplate.getForObject(baseUrl + "search?fname=Madison", RealEstate[].class);
        assertThat(realEstates).isNotNull();

        RealEstate realEstate = new RealEstate();
        realEstate.setFname("Madison");
        String response = restTemplate.postForObject(baseUrl + "add", realEstate, String.class);
        assertThat(response).isEqualTo("success");

        for (RealEstate realEstate1 : realEstates)
            assertThat(realEstate1.getFname()).isEqualTo("Madison");
    }
}