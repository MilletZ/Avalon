import javax.sound.midi.*;

public class MiniMusicCmdLine{


    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Don't forget the instrument and note args.");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            MiniMusicCmdLine mini = new MiniMusicCmdLine();
            mini.play(instrument, note);
        }
    }

    public void play(int theInstrument, int theNote){
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, theInstrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, theNote, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, theNote, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
