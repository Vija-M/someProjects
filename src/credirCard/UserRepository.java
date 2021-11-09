package credirCard;

import java.util.Arrays;
import java.util.UUID;

class UserRepository {
    private UserEntity[] users = new UserEntity[0];

    UUID save(UserEntity entity) {
        users = Arrays.copyOf(users, users.length + 1);
        UUID randomUUID = UUID.randomUUID();
        entity.setId(randomUUID);
        users[users.length - 1] = entity;
        return randomUUID;
    }

    UserEntity findByID(UUID uuid) {
        for ( UserEntity entity : users ) {
            if (entity != null && entity.getId().equals(uuid)) {
                return entity;
            }
        }
        return null;
    }

    UserEntity findByName(String firstName) {
        for ( UserEntity entity : users ) {
            if (entity != null && entity.getFirstName().equals(firstName)) {
                return entity;
            }
        }
        return null;
    }

    UserEntity findByLastName(String lastName) {
        for ( UserEntity entity : users ) {
            if (entity != null && entity.getLastName().equals(lastName)) {
                return entity;
            }
        }
        return null;
    }

    UserEntity findByPersonalCode(String personalCode) {
        for ( UserEntity entity : users ) {
            if (entity.getPersonalCode().equals(personalCode)) {
                return entity;
            }
        }
        return null;
    }

    UserEntity[] findAll() {
        return users;
    }

    UserEntity updateUser(UUID uuid, String newPersonalCode, String newFirstName, String newLastName) {
        for ( UserEntity entity : users ) {
            if (entity.getId().equals(uuid)) {
                entity.setPersonalCode(newPersonalCode);
                entity.setName(newFirstName);
                entity.setFamilyName(newLastName);
                return entity;
            }
        }
        return null;
    }

    Object delete(UUID uuid) {
        for ( int i = 0; i < users.length; i++ ) {
            if (users[i] != null && users[i].getId().equals(uuid)) {
                UserEntity user = users[i];
                users[i] = null;
                return user;
            }
        }
        return null;
    }


}

