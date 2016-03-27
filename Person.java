package za.ac.mzilikazi;

/**
 * Created by mandisi on 2016-03-27.
 */
public class Person {

        String name;
        String surname;
        String idNumber;

        public Person() {
        }

        public Person(String name, String surname, String idNumber) {
            this.name = name;
            this.surname = surname;
            this.idNumber = idNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(String idNumber) {
            this.idNumber = idNumber;
        }

        public void occupation(){
            System.out.print("Humans have different occupations.");
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", idNumber='" + idNumber + '\'' +
                    '}';
        }

    }
