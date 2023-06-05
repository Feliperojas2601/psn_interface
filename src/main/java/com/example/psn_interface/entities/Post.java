package com.example.psn_interface.entities;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Post {
        private String _id;
        private Integer ownerId;
        private String location;
        private String description;

        public String _id() {
          return this._id;
        }

        public int ownerId() {
          return this.ownerId;
        }

        public String location() {
          return this.location;
        }

        public String description() {
          return this.description;
        }
}
