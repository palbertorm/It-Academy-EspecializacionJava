package barcelonactiva.PauloAlberto.model.services.intefaces;

import barcelonactiva.PauloAlberto.model.dto.PlayerDTO;

public interface PlayerRankingService { double getSuccessRateAverage ();
   PlayerDTO getWinner ();
   PlayerDTO getLoser ();
}
