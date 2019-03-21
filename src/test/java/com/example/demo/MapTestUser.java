package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class MapTestUser {
    private  Long id;
    private  String name;

    public static void main(String[] args) {
        MapTestUser user = new MapTestUser();
    }
}
