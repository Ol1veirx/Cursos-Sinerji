package io.github.ol1veirx.rest.controller;

import io.github.ol1veirx.domain.entity.Cliente;
import io.github.ol1veirx.domain.repository.Clientes;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@Api("API de Clientes")
public class ClienteController {

    private Clientes clientes;

    public ClienteController( Clientes clientes ) {
        this.clientes = clientes;
    }

    @GetMapping("{id}")
    @ApiOperation("Obter detalhes do cliente")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Cliente encontrado"),
        @ApiResponse(code = 404, message = "Cliente não encontrado")
    })
    public Cliente getClienteById( @PathVariable @ApiParam("Id do cliente") Integer id ){
        return clientes
                .findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Cliente não encontrado"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Salvar um cliente")
    @ApiResponses({
        @ApiResponse(code = 201, message = "Cliente salvado com sucesso"),
        @ApiResponse(code = 400, message = "Erro de validação")
    })
    public Cliente save( @RequestBody @Valid Cliente cliente ){
        return clientes.save(cliente);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation("Deletar um cliente")
    public void delete( @PathVariable Integer id ){
        clientes.findById(id)
                .map( cliente -> {
                    clientes.delete(cliente );
                    return cliente;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Cliente não encontrado") );

    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation("Atualizar um cliente")
    public void update( @PathVariable Integer id,
                        @RequestBody @Valid Cliente cliente ){
        clientes
                .findById(id)
                .map( clienteExistente -> {
                    cliente.setId(clienteExistente.getId());
                    clientes.save(cliente);
                    return clienteExistente;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Cliente não encontrado") );
    }

    @GetMapping
    public List<Cliente> find( Cliente filtro ){
        ExampleMatcher matcher = ExampleMatcher
                                    .matching()
                                    .withIgnoreCase()
                                    .withStringMatcher(
                                            ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        return clientes.findAll(example);
    }

}
