/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2021 the original author or authors.
 */
package org.assertj.core.api;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

// CS427 Issue link: https://github.com/assertj/assertj-core/issues/2296
/**
 * Test cases for assertThat.hasNumberOfRows() methods
 */
class Assertions_assertThat_hasNumberOfRows_Test {

  @Test
  void int_array_row_num() {
    int[][] arr_int = {};
    assertThat(arr_int).hasNumberOfRows(0);
  }

  @Test
  void char_array_row_num() {
    char [][] arr_char = {{'1','2'},{'1'},{'1','2','3'}};
    assertThat(arr_char).hasNumberOfRows(3);
  }

  @Test
  void double_array_row_num() {
    double [][] arr_double = {{2.0,1.0}};
    assertThat(arr_double).hasNumberOfRows(1);
  }

  @Test
  void float_array_row_num() {
    float [][] arr_float = {{2.0f,1.0f},{1.0f},{0f},{5.0f}};
    assertThat(arr_float).hasNumberOfRows(4);
  }

  @Test
  void long_array_row_num() {
    long [][] arr_long = {{2,1}};
    assertThat(arr_long).hasNumberOfRows(1);
  }

  @Test
  void short_array_row_num() {
    short [][] arr_short = {{2},{3},{1},{4},{9}};
    assertThat(arr_short).hasNumberOfRows(5);
  }

  @Test
  void string_array_row_num() {
    String [][] arr_string = {{"1","2"}};
    assertThat(arr_string).hasNumberOfRows(1);
  }

  @Test
  void boolean_array_row_num() {
    boolean [][] arr_boolean = {{true}};
    assertThat(arr_boolean).hasNumberOfRows(1);
  }

  @Test
  void byte_array_row_num() {
    byte [][] arr_byte = {{2,3,4},{2,3,4}};
    assertThat(arr_byte).hasNumberOfRows(2);
  }
}
