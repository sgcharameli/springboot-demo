package com.sgcharameli.sbdemo.adapters.rest.resources.impl;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.sgcharameli.sbdemo.adapters.rest.resources.dto.PageableFileDescriptorDto;
import com.sgcharameli.sbdemo.adapters.rest.resources.dto.PageableStockDto;
import com.sgcharameli.sbdemo.adapters.rest.resources.dto.StockDto;
import com.sgcharameli.sbdemo.adapters.rest.resources.dto.StockFileDto;
import com.sgcharameli.sbdemo.adapters.rest.resources.spec.StocksApi;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class StocksRestController implements StocksApi {

  @Override
  public ResponseEntity<Void> createStock(StockDto stockDto) {
    return null;
  }

  @Override
  public ResponseEntity<Void> deleteStockById(Long stockId) {
    return null;
  }

  @Override
  public ResponseEntity<PageableFileDescriptorDto> getAllStockFiles() {
    return null;
  }

  @Override
  public ResponseEntity<PageableStockDto> getAllStocks(String country, Integer page, Integer perPage, String orderBy) {
    log.info("getAllStocks");
    return null;
  }

  @Override
  public ResponseEntity<StockDto> getStockById(Long stockId) {
    return null;
  }

  @Override
  public ResponseEntity<StockFileDto> getStockFile(Long stockId, UUID fieldId) {
    return null;
  }

  @Override
  public ResponseEntity<StockDto> patchStockById(Long stockId, StockDto stockDto) {
    return null;
  }

  @Override
  public ResponseEntity<StockDto> putStockById(Long stockId, StockDto stockDto) {
    return null;
  }

  @Override
  public ResponseEntity<Void> saveStockFile(StockFileDto stockFileDto) {
    return null;
  }
}
