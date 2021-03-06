// Copyright 2017 The Nomulus Authors. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package google.registry.model.mark;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Unit tests for {@link MarkHolder}. */
@RunWith(JUnit4.class)
public final class MarkHolderTest {

  @Test
  public void testDeadCodeWeDontWantToDelete() {
    MarkHolder mc = new MarkHolder();
    mc.entitlement = MarkHolder.EntitlementType.OWNER;
    assertThat(mc.getEntitlementType()).isEqualTo(MarkHolder.EntitlementType.OWNER);
  }
}
