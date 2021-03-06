package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * @author NH 2021-08-19
 */
public class Pet extends BaseEntity {

    private String petName;
    private PetType petType;
    private Owner owner;
    private LocalDate birthday;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
