package com.re.wanderlust.core.models.internals;
import lombok.Data;
import java.util.List;

@Data
public class CommonEntityTours {

      private String startLocationLat;
      private String startLocationLong;
      private List<WhereLocationEntityTours> whereLocation;
}
