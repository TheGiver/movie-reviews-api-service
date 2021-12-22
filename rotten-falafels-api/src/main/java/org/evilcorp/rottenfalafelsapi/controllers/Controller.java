package org.evilcorp.rottenfalafelsapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface Controller {

    ResponseEntity<?> endpoint(@RequestBody );
}
