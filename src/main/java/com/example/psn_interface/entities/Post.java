package com.example.psn_interface.entities;


public class Post {
        private String _id;
        private Integer ownerId;
        private String location;
        private String description;

        public Post(String _id, Integer ownerId, String location, String description) {
                this._id = _id;
                this.ownerId = ownerId;
                this.location = location;
                this.description = description;
        }

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
