package dsova.symbolspot;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView iconView;
    private EditText guessText;

    private Random rng = new Random();
    private int pictureRID;
    private int answersNumber;
    private String currentAnswerForPic;
    private String[] answers = {"watch l", "arrow forward", "arrow drop up", "3d rotation", "ac unit", "access alarm", "access alarms", "access time", "accessibility", "accessible", "account balance", "account balance wallet", "account box", "account circle", "adb", "add a photo", "add alarm", "add alert", "add", "add box", "add circle", "add circle outline", "add location", "add shopping cart", "add to photos", "add to queue", "adjust", "airline seat flat angled", "airline seat flat", "airline seat individual suite", "airline seat legroom extra", "airline seat legroom normal", "airline seat legroom reduced", "airline seat recline extra", "airline seat recline normal", "airplanemode active", "airplanemode inactive", "airplay", "airport shuttle", "alarm add", "alarm", "alarm off", "alarm on", "album", "all inclusive", "all out", "android", "announcement", "apps", "archive", "arrow back", "arrow downward", "arrow drop down", "arrow drop down circle", "arrow upward", "art track", "aspect ratio", "assessment", "assignment", "assignment ind", "assignment late", "assignment return", "assignment returned", "assignment turned in", "assistant", "assistant photo", "attach file", "attach money", "attachment", "audiotrack", "autorenew", "av timer", "backspace", "backup", "battery 20", "battery 30", "battery 50", "battery 60", "battery 80", "battery 90", "battery alert", "battery charging 20", "battery charging 30", "battery charging 50", "battery charging 60", "battery charging 80", "battery charging 90", "battery charging full", "battery full", "battery std", "battery unknown", "beach access", "beenhere", "block", "bluetooth audio", "bluetooth", "bluetooth connected", "bluetooth disabled", "bluetooth searching", "blur circular", "blur linear", "blur off", "blur on", "book", "bookmark", "bookmark border", "border all", "border bottom", "border clear", "border color", "border horizontal", "border inner", "border left", "border outer", "border right", "border style", "border top", "border vertical", "branding watermark", "brightness 1", "brightness 2", "brightness 3", "brightness 4", "brightness 5", "brightness 6", "brightness 7", "brightness auto", "brightness high", "brightness low", "brightness medium", "broken image", "brush", "bubble chart", "bug report", "build", "burst mode", "business", "business center", "cached", "cake", "call", "call end", "call made", "call merge", "call missed", "call missed outgoing", "call received", "call split", "call to action", "camera alt", "camera", "camera enhance", "camera front", "camera rear", "camera roll", "cancel", "card giftcard", "card membership", "card travel", "casino", "cast", "cast connected", "center focus strong", "center focus weak", "change history", "chat", "chat bubble", "chat bubble outline", "check", "check circle", "chevron left", "chevron right", "child care", "child friendly", "chrome reader mode", "class", "clear all", "clear", "close", "closed caption", "cloud", "cloud circle", "cloud done", "cloud download", "cloud off", "cloud queue", "cloud upload", "code", "collections", "collections bookmark", "color lens", "colorize", "comment", "compare arrows", "compare", "computer", "confirmation number", "contact mail", "contact phone", "contacts", "content copy", "content cut", "content paste", "control point", "control point duplicate", "copyright", "create", "create new folder", "credit card", "crop 3 2", "crop 5 4", "crop 7 5", "crop 16 9", "crop", "crop din", "crop free", "crop landscape", "crop original", "crop portrait", "crop rotate", "crop square", "dashboard", "data usage", "date range", "dehaze", "delete", "delete forever", "delete sweep", "description", "desktop mac", "desktop windows", "details", "developer board", "developer mode", "device hub", "devices", "devices other", "dialer sip", "dialpad", "directions bike", "directions", "directions boat", "directions bus", "directions car", "directions railway", "directions run", "directions subway", "directions transit", "directions walk", "disc full", "dns", "do not disturb alt", "do not disturb", "do not disturb off", "do not disturb on", "dock", "domain", "done all", "done", "donut large", "donut small", "drafts", "drag handle", "drive eta", "dvr", "edit", "edit location", "eject", "email", "enhanced encryption", "equalizer", "error", "error outline", "euro symbol", "ev station", "event available", "event", "event busy", "event note", "event seat", "exit to app", "expand less", "expand more", "explicit", "explore", "exposure", "exposure neg 1", "exposure neg 2", "exposure plus 1", "exposure plus 2", "exposure zero", "extension", "face", "fast forward", "fast rewind", "favorite", "favorite border", "featured play list", "featured video", "feedback", "fiber dvr", "fiber manual record", "fiber new", "fiber pin", "fiber smart record", "file download", "file upload", "filter 1", "filter 2", "filter 3", "filter 4", "filter 5", "filter 6", "filter 7", "filter 8", "filter 9", "filter 9 plus", "filter b and w", "filter", "filter center focus", "filter drama", "filter frames", "filter hdr", "filter list", "filter none", "filter tilt shift", "filter vintage", "find in page", "find replace", "fingerprint", "first page", "fitness center", "flag", "flare", "flash auto", "flash off", "flash on", "flight", "flight land", "flight takeoff", "flip", "flip to back", "flip to front", "folder", "folder open", "folder shared", "folder special", "font download", "format align center", "format align justify", "format align left", "format align right", "format bold", "format clear", "format color fill", "format color reset", "format color text", "format indent decrease", "format indent increase", "format italic", "format line spacing", "format list bulleted", "format list numbered", "format paint", "format quote", "format shapes", "format size", "format strikethrough", "format textdirection l to r", "format textdirection r to l", "format underlined", "forum", "forward 5", "forward 10", "forward 30", "forward", "free breakfast", "fullscreen", "fullscreen exit", "functions", "g translate", "gamepad", "games", "gavel", "gesture", "get app", "gif", "golf course", "gps fixed", "gps not fixed", "gps off", "grade", "gradient", "grain", "graphic eq", "grid off", "grid on", "group add", "group", "group work", "hd", "hdr off", "hdr on", "hdr strong", "hdr weak", "headset", "headset mic", "healing", "hearing", "help", "help outline", "high quality", "highlight", "highlight off", "history", "home", "hot tub", "hotel", "hourglass empty", "hourglass full", "http", "https", "image aspect ratio", "image", "import contacts", "import export", "important devices", "inbox", "info", "info outline", "input", "insert chart", "insert comment", "insert drive file", "insert emoticon", "insert invitation", "insert link", "insert photo", "invert colors", "invert colors off", "iso", "keyboard arrow down", "keyboard arrow left", "keyboard arrow right", "keyboard arrow up", "keyboard backspace", "keyboard", "keyboard capslock", "keyboard hide", "keyboard return", "keyboard tab", "keyboard voice", "kitchen", "label", "label outline", "landscape", "language", "laptop", "laptop chromebook", "laptop mac", "laptop windows", "last page", "launch", "layers", "layers clear", "leak add", "leak remove", "lens", "library add", "library books", "library music", "lightbulb outline", "line style", "line weight", "linear scale", "link", "linked camera", "list", "live help", "live tv", "local activity", "local airport", "local atm", "local bar", "local cafe", "local car wash", "local convenience store", "local dining", "local drink", "local florist", "local gas station", "local grocery store", "local hospital", "local hotel", "local laundry service", "local library", "local mall", "local movies", "local offer", "local parking", "local pharmacy", "local phone", "local pizza", "local play", "local post office", "local printshop", "local see", "local shipping", "local taxi", "location city", "location disabled", "location off", "location on", "location searching", "lock", "lock open", "lock outline", "looks 3", "looks 4", "looks 5", "looks 6", "looks", "looks one", "looks two", "loop", "loupe", "low priority", "loyalty", "mail", "mail outline", "map", "markunread", "markunread mailbox", "memory", "merge type1534-menu", "message", "mic", "mic none", "mic off", "mms", "mode comment", "mode edit", "monetization on", "money off", "monochrome photos", "mood bad", "mood", "more", "more horiz", "more vert", "motorcycle", "mouse", "move to inbox", "movie", "movie creation", "movie filter", "multiline chart", "music note", "music video", "my location", "nature", "nature people", "navigate before", "navigate next", "navigation", "near me", "network cell", "network check", "network locked", "network wifi", "new releases", "next week", "nfc", "no encryption", "no sim", "not interested", "note add", "note", "notifications active", "notifications", "notifications none", "notifications off", "notifications paused", "offline pin", "ondemand video", "opacity", "open in browser", "open in new", "open with", "pages", "pageview", "palette", "pan tool", "panorama", "panorama fish eye", "panorama horizontal", "panorama vertical", "panorama wide angle", "party mode", "pause", "pause circle filled", "pause circle outline", "payment", "people", "people outline", "perm camera mic", "perm contact calendar", "perm data setting", "perm device information", "perm identity", "perm media", "perm phone msg", "perm scan wifi", "person add", "person", "person outline", "person pin", "person pin circle", "personal video", "pets", "phone android", "phone", "phone bluetooth speaker", "phone forwarded", "phone in talk", "phone iphone", "phone locked", "phone missed", "phone paused", "phonelink", "phonelink erase", "phonelink lock", "phonelink off", "phonelink ring", "phonelink setup", "photo album", "photo", "photo camera", "photo filter", "photo library", "photo size select actual", "photo size select large", "photo size select small", "picture as pdf", "picture in picture alt", "picture in picture", "pie chart", "pie chart outlined", "pin drop", "place", "play arrow", "play circle filled", "play circle filled white", "play circle outline", "play for work", "playlist add", "playlist add check", "playlist play", "plus one", "poll", "polymer", "pool", "portable wifi off", "portrait", "power", "power input", "power settings new", "pregnant woman", "present to all", "print", "priority high", "public", "publish", "query builder", "question answer", "queue", "queue music", "queue play next", "radio", "rate review", "receipt", "recent actors", "record voice over", "redeem", "redo", "refresh", "remove", "remove circle", "remove circle outline", "remove from queue", "remove red eye", "remove shopping cart", "reorder", "repeat", "repeat one", "replay 5", "replay 10", "replay 30", "replay", "reply all", "reply", "report", "report problem", "restaurant", "restaurant menu", "restore", "restore page", "ring volume", "room", "room service", "rotate 90 degrees ccw", "rotate left", "rotate right", "rounded corner", "router", "rowing", "rss feed", "rv hookup", "satellite", "save", "scanner", "schedule", "school", "screen lock landscape", "screen lock portrait", "screen lock rotation", "screen rotation", "screen share", "sd card", "sd storage", "search", "security", "select all", "send", "sentiment dissatisfied", "sentiment neutral", "sentiment satisfied", "sentiment very dissatisfied", "sentiment very satisfied", "settings applications", "settings backup restore", "settings", "settings bluetooth", "settings brightness", "settings cell", "settings ethernet", "settings input antenna", "settings input component", "settings input composite", "settings input hdmi", "settings input svideo", "settings overscan", "settings phone", "settings power", "settings remote", "settings system daydream", "settings voice", "share", "shop", "shop two", "shopping basket", "shopping cart", "short text", "show chart", "shuffle", "signal cellular 0 bar", "signal cellular 1 bar", "signal cellular 2 bar", "signal cellular 3 bar", "signal cellular 4 bar", "signal cellular connected no internet 0 bar", "signal cellular connected no internet 1 bar", "signal cellular connected no internet 2 bar", "signal cellular connected no internet 3 bar", "signal cellular connected no internet 4 bar", "signal cellular no sim", "signal cellular null", "signal cellular off", "signal wifi 0 bar", "signal wifi 1 bar", "signal wifi 1 bar lock", "signal wifi 2 bar", "signal wifi 2 bar lock", "signal wifi 3 bar", "signal wifi 3 bar lock", "signal wifi 4 bar", "signal wifi 4 bar lock", "signal wifi off", "sim card alert", "sim card", "skip next", "skip previous", "slideshow", "slow motion video", "smartphone", "smoke free", "smoking rooms", "sms", "sms failed", "snooze", "sort", "sort by alpha", "spa", "space bar", "speaker", "speaker group", "speaker notes", "speaker notes off", "speaker phone", "spellcheck", "star", "star border", "star half", "stars", "stay current landscape", "stay current portrait", "stay primary landscape", "stay primary portrait", "stop", "stop screen share", "storage", "store", "store mall directory", "straighten", "streetview", "strikethrough s", "style", "subdirectory arrow left", "subdirectory arrow right", "subject", "subscriptions", "subtitles", "subway", "supervisor account", "surround sound", "swap calls", "swap horiz", "swap vert", "swap vertical circle", "switch camera", "switch video", "sync", "sync disabled", "sync problem", "system update alt", "system update", "tab", "tab unselected", "tablet android", "tablet", "tablet mac", "tag faces", "tap and play", "terrain", "text fields", "text format", "textsms", "texture", "theaters", "thumb down", "thumb up", "thumbs up down", "time to leave", "timelapse", "timeline", "timer 3", "timer 10", "timer", "timer off", "title", "toc", "today", "toll", "tonality", "touch app", "toys", "track changes", "traffic", "train", "tram", "transfer within a station", "transform", "translate", "trending down", "trending flat", "trending up", "tune", "turned in", "turned in not", "tv", "unarchive", "undo", "unfold less", "unfold more", "update", "usb", "verified user", "vertical align bottom", "vertical align center", "vertical align top", "vibration", "video call", "video label", "video library", "videocam", "videocam off", "videogame asset", "view agenda", "view array", "view carousel", "view column", "view comfy", "view compact", "view day", "view headline", "view list", "view module", "view quilt", "view stream", "view week", "vignette", "visibility", "visibility off", "voice chat", "voicemail", "volume down", "volume mute", "volume off", "volume up", "vpn key", "vpn lock", "wallpaper", "warning", "watch", "wb auto", "wb cloudy", "wb incandescent", "wb iridescent", "wb sunny", "wc", "web asset", "web", "weekend", "whatshot", "widgets", "wifi", "wifi lock", "wifi tethering", "work", "wrap text", "youtube searched for", "zoom in", "zoom out"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        iconView = (ImageView) findViewById(R.id.iconview);
        iconView.setImageResource(pictureRID);
        guessText = (EditText) findViewById(R.id.guesseditText);

        pictureRID = rng.nextInt(954) + 2130837504;
        iconView.setImageResource(pictureRID);
        answersNumber = pictureRID - 2130837504;
        currentAnswerForPic = answers[answersNumber];



        //Notes:
        //answers[0] = _1000.png
        //answers[954] = _1954.png

        //1000 - 1954
        //0 - 954
        //2130837504 - 2130838458

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();

                if(currentAnswerForPic.equalsIgnoreCase(guessText.getText().toString())) { //Change
                    pictureRID = rng.nextInt(954) + 2130837504;
                    iconView.setImageResource(pictureRID);
                    answersNumber = pictureRID - 2130837504;
                    currentAnswerForPic = answers[answersNumber];
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
