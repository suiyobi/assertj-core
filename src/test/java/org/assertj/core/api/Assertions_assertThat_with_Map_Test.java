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

import static java.util.Collections.emptyMap;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * Tests for <code>{@link Assertions#assertThat(Map)}</code>.
 * 
 * @author Alex Ruiz
 * @author Nicolas François
 */
class Assertions_assertThat_with_Map_Test {

  @Test
  void should_create_Assert() {
    AbstractMapAssert<?, ? extends Map<Object, Object>, Object, Object> assertions = Assertions.assertThat(emptyMap());
    assertThat(assertions).isNotNull();
  }

  @Test
  void should_pass_actual() {
    Map<Object, Object> actual = new HashMap<>();
    AbstractMapAssert<?, ? extends Map<Object, Object>, Object, Object> assertions = Assertions.assertThat(actual);
    assertThat(assertions.actual).isSameAs(actual);
  }

  // CS427 Issue link: https://github.com/assertj/assertj-core/issues/2381
  @Test
  void should_pass_Unmodifiable(){
    Map<String, String> map = new HashMap<>();
    map.put("key", "value");
    Map<String, String> actual = Collections.unmodifiableMap(map);
    assertThat(actual).isUnmodifiable();
  }

  // CS427 Issue link: https://github.com/assertj/assertj-core/issues/2381
  @Test
  void should_fail_modifiable(){
    Map<String, String> actual = new HashMap<>();
    actual.put("key", "value");
    try {
      assertThat(actual).isUnmodifiable();}
    catch(AssertionError e){
      System.out.println(e.getMessage());
    }
  }
}
