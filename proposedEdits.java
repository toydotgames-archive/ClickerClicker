// autoClickTimer = new Timer(if(autoClickLevel==1) {static int autoClickSpeed = 1000}, else if(autoClickLevel==2) {static int autoClickSpeed = 750}, else if(autoClickLevel==3) {static int autoClickSpeed = 500}, else if(autoClickLevel==4) {static int autoClickSpeed = 300}, else if(autoClickLevel==5) {static int autoClickSpeed = 100}, else if(autoClickLevel==6) {static int autoClickSpeed = 80}, else if(autoClickLevel==7) {static int autoClickSpeed = 50}, else if(autoClickLevel==8) {static int autoClickSpeed 20}, else if(autoClickLevel==9) {static int autoClickSpeed 2}); // `autoClickSpeed` is the delay between `clicks++;` in milliseconds.


static void UpdatePresence()
{
    DiscordRichPresence discordPresence;
    memset(&discordPresence, 0, sizeof(discordPresence));
    discordPresence.details = clicks + " Clicks";
    discordPresence.partyId = "null";
    discordPresence.joinSecret = "nul";
    Discord_UpdatePresence(&discordPresence);
}
// discord rpc
