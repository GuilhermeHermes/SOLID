package lsp.problema;

public class RadioPlayer extends MediaPlayer {

    @Override
   public void reproduzir() {
        throw new UnsupportedOperationException("RadioPlayer doesn't support playing files");
    }
    // Não podemos reproduzir arquivos de áudio ou vídeo com um RadioPlayer, logo a nossa hierarquia de classes está errada.
}
