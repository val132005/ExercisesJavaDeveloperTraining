package com.globant.training.sampledto.service;
import com.globant.training.sampledto.domain.dto.UserAccountGetDto;
import com.globant.training.sampledto.domain.entity.Account;
import com.globant.training.sampledto.domain.entity.Address;
import com.globant.training.sampledto.domain.entity.Document;
import com.globant.training.sampledto.domain.entity.DocumentType;
import com.globant.training.sampledto.domain.entity.User;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  /**
   * Strategy 1
   * "Naive converter via private method"
   */
  public List<UserAccountGetDto> findAllUsersStrategy1() {
    return List.of();
  }

  /**
   * Strategy 1
   * "User Spring Interface Converter"
   */
  public List<UserAccountGetDto> findAllUsersStrategy2() {
    return List.of();
  }

  /**
   * Strategy 3
   * Create a StructMap interface to convert
   */
  public List<UserAccountGetDto> findAllUsersStrategy3() {
    return List.of();
  }






  /**
   * TODO: This should be moved to a repository
   */
  private List<User> findAllUsersFromDatabase() {
    // for now a list of only one user
    // builder is one of benefits of lombok
    // exercise Research about Builder pattern
    return List.of(
        User.builder()
            .id(1L)
            .name("Oskar Raúl")
            .document(Document.builder()
                .id(20L)
                .type(DocumentType.CC)
                .number("1.999.999")
                .issueDate(LocalDate.of(2010, Month.MARCH, 3))
                .expirationDate(null)
                .build())
            .account(Account.builder()
                .id(53L)
                .login("oskar.raul")
                .password("123")
                .active(true)
                .build())
            .address(Address.builder()
                .id(4L)
                .street("calle 99")
                .number("#34A-44")
                .houseOrDept("Conjunto XX Piso 2 Ap 299")
                .city("Bogotá DC")
                .phoneNumber("315-9999999")
                .build())
            .build());
  }
}
