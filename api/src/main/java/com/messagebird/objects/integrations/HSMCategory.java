package com.messagebird.objects.integrations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * An enum for HSMComponentFormat
 *
 * @see <a href="https://developers.messagebird.com/api/integrations/#hsmcomponentformat-object">HSMComponentFormat</a>
 * @author ssk910
 */
public enum HSMCategory {

  AUTHENTICATION("AUTHENTICATION"),
  UTILITY("UTILITY"),
  MARKETING("MARKETING");

  private final String category;

  HSMCategory(String category) {
    this.category = category;
  }

  @JsonCreator
  public static HSMCategory forValue(String value) {
    for (HSMCategory hsmCategory : HSMCategory.values()) {
      if (hsmCategory.getCategory().equals(value)) {
        return hsmCategory;
      }
    }

    return null;
  }

  @JsonValue
  public String toJson() {
    return getCategory();
  }

  public String getCategory() {
    return category;
  }

  @Override
  public String toString() {
    return getCategory();
  }
}
