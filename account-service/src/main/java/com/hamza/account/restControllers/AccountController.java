package com.hamza.account.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamza.account.dto.AccountDto;
import com.hamza.account.service.AccountService;
import com.hamza.account.config.Configuration;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountController {

  private final AccountService accountService;

  @Value("${build.version}")
  private String buildVersion;

  private final Configuration configuration;

  @GetMapping("/{number}")
  public ResponseEntity<AccountDto> getAccByNumber(@PathVariable("number") String number) {
    return new ResponseEntity<>(accountService.getAccountByNumber(number), HttpStatus.OK);
  }

  @GetMapping("/version")
  public ResponseEntity<String> version() {
    return ResponseEntity.ok(buildVersion);
  }

  @GetMapping("/author")
  public ResponseEntity<String> retrieveAuthorInfo() {
    return ResponseEntity.ok(
        configuration.getName() + " " + configuration.getEmail());
  }
}
