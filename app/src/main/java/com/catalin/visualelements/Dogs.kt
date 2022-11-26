package com.catalin.visualelements

data class Dog(
    val name: String,
    val imageId: Int,
    val desc: String
)

fun getDogs(): List<Dog> {
    val dogs = arrayListOf<Dog>()
    for (i in 0..29) {
        dogs.add(Dog(names[i], imageIds[i], desc[i]))
    }
    return dogs
}


val names = listOf(
    "Labrador retriever",
    "German shepherd",
    "Golden retriever",
    "French bulldog",
    "Bulldog",
    "Beagle",
    "Poodle",
    "Rottweiler",
    "Yorkshire terrier",
    "German Shorthaired Pointer",
    "Boxer",
    "Siberian husky",
    "Dachsund",
    "Great dane",
    "Pembroke Welsh Corgi",
    "Doberman Pinscher",
    "Australian Shepherd",
    "Miniature Schnauzer",
    "Cavalier King Charles Spaniel",
    "Shih Tzu",
    "Boston Terrier",
    "Pomeranian",
    "Havanese",
    "Shetland sheepdog",
    "Bernese mountain dog",
    "Brittany",
    "English springer spaniel",
    "Mastiff",
    "Cocker spaniel",
    "Vizsla"
)

val imageIds = listOf(
    R.drawable.d1_lab,
    R.drawable.d2_german_shepherd,
    R.drawable.d3_golden,
    R.drawable.d4_french_bulldog,
    R.drawable.d5_bulldog,
    R.drawable.d6_beagle,
    R.drawable.d7_poodle,
    R.drawable.d8_rottweiler,
    R.drawable.d9_terrier,
    R.drawable.d10_pointer,
    R.drawable.d11_boxer,
    R.drawable.d12_husky,
    R.drawable.d13_dachsund,
    R.drawable.d14_great_dane,
    R.drawable.d15_corgi,
    R.drawable.d16_doberman,
    R.drawable.d17_australian_shepherd,
    R.drawable.d18_schnauzer,
    R.drawable.d19_spaniel,
    R.drawable.d20_shih_tzu,
    R.drawable.d21_terrier,
    R.drawable.d22_pomeranian,
    R.drawable.d23_havanese,
    R.drawable.d24_shetland_sheepdog,
    R.drawable.d25_bernese,
    R.drawable.d26_brittany,
    R.drawable.d27_english_springer,
    R.drawable.d28_mastiff,
    R.drawable.d29_cocker_spaniel,
    R.drawable.d30_vizsla,
)

val desc = listOf(
    "Labs are currently the most popular dog in the U.S., and with good reason — this family-friendly companion is good-natured, hard-working and covers all the bases as man’s best friend. \nLabs still work with hunters in retrieving game as they did centuries ago, but they also work as search and rescue, service and show dogs, and make a welcome addition to any home.",
    "When it comes to devotion, loyalty and protection, you can’t do better than the German shepherd. They are intelligent, capable and extremely fearless, which is why they’re usually working with law enforcement. \nShepherds also make great service, search and rescue, and herding dogs, but mostly, they excel as faithful companions to every member of the family.",
    "When you think of a dog that is the picture-perfect family companion, it’s likely that the golden is high on your list. These fun pups are a big favorite among kids of all ages who love their silliness and loyalty. \nWhether you need a best friend to comfort you in your time of need or a playmate to frolic with, the golden is happy to serve you in any role you require.",
    "With their large bat ears, big eyes and short noses, Frenchies are extremely popular clowns, but they are also quite affectionate and protective. \nThey can live just about anywhere and do not require much exercise, which makes them perfect for apartment dwellers and seniors alike. ",
    "The rough and rugged bulldog was originally a cattle driver, but today, they make wonderful playmates for kids. They are gentle, loving and eager to please, and don’t need much exercise. \nAs a matter of fact, they are very content to nap — a lot — but do watch their weight and keep them out of extreme temperatures.",
    "Beagles are active family dogs that bring big personality in a small body. Hardy, friendly and sometimes stubborn, the beagle is known for having a big voice and is a friend to kids and adults alike. \nKeep an eye on them in your yard, however — they were originally bred to track small game and still have that instinct.",
    "When it comes to poodles you have three sizes to choose from — standard, miniature and toy. Whichever you choose, don’t mistake the poodle for a simple lap dog. They are athletic, smart and fun for the whole family. \nPoodles are still very much working dogs at heart — they were once great hunters of waterfowl, and their ornate grooming reflects that history.",
    "We imagine that when you think of guard dogs, the Tottie is forefront in your mind. Well, at nearly 27-inches tall, they can be imposing, especially for strangers. \nHowever, they make a calm, confident companion for any family. Make sure to train and socialize your pup early, as to not be overly territorial.",
    "Yorkies are more than toys — they were bred as ratters and are surprisingly tough for being such little dogs. They pack a big attitude in a tiny frame and can be feisty or even bossy without the proper training. At the same time, these traits make them great guard dogs. \nYorkies make popular city dogs and are hypoallergenic, both of which are reasons for their popularity, but more than anything else, they are loving, loyal companions to their chosen humans. ",
    "When you’re looking for a graceful, loving dog, look no further than the German shorthaired pointer. The pointer exudes elegance, but they’re also powerful with plenty of speed and agility. \nWhile they make excellent hunters, they’re also wonderful family companions who love to play and need plenty of mental and physical challenges to stay motivated and happy.",
    "The ever-alert boxer is a curious powerhouse with a smooth, assured gait. This upbeat and playful pup is great with kids due to their patience and gentleness, but they’re also a protective watchdog with no fear. \nJust note that they should be socialized from an early age.",
    "You know them as snow dogs leading teams sledding through the Alaskan wilderness, but Huskies make great family pets just the same. This powerful, friendly, agile breed is a natural pack dog and gets along with every human and animal alike. \nFor this reason, they don’t make particularly great guard dogs, as they may lick an intruder into submission.",
    "With their stubbly legs and sausage-like bodies, doxies aren’t made for strenuous exercise, but that doesn’t mean they’re dainty either. They’re tough little dogs, with a keen protective streak. \nTheir big-dog bark makes them excellent watchdogs, and they’re extremely loyal to their owners",
    "When standing on their hind legs, this gentle giant is taller than most people, casting an imposing figure.\nBut while you wouldn’t want to tangle with a Great Dane when they’re in the role of guard dog, they have a sweet nature when it comes to those they trust and love.",
    "If they’re good enough for Queen Elizabeth, they’re good enough for your family! Despite their royal lineage, Pembrokes are not lap dogs. They were bred to be herding dogs, and fearlessness and independence are still inherent in the breed. \nThis bold but friendly dog thrives with plenty of activity and family time.",
    "When you think of Dobies, you probably think of a muscular, lean dog ready to protect their owners at all cost. While they do make great guard dogs, they’re also loving companions but need to be socialized from an early age. \nExercise is also important for Dobies — without it, they can become bored or agitated, which can lead to aggression.",
    "These medium-sized herding dogs are known for their intellect, and they make great family pets. But they still have deep instincts to herd and will do so with everything from animals to kids. \nIf you’re sedentary, this may not be the pet for you, as the shepherd longs to be active. However, if you love an intellectual and tireless sparring partner, you may have found your new best friend.",
    "Cute but sometimes aloof, minis have long beards and brows that give them the appearance of a human looking at you in judgment. But looks can deceive, as they are some of the most loving breeds around. \nThey’re tough, too — they were bred to be ratters and remain fearless, but they are friendly, trainable and get along with animals and kids.",
    "Noble. That’s the word usually used to describe this graceful, small dog with big round eyes that can easily charm their owner into a treat or playtime. While Cavs have a royal lineage, they are easy-going and quite friendly to everyone.\nIf you’re active, they’re happy to join in on your activities. And if not, they’re content to sleep next to you on the couch.",
    "Shih Tzus capture the heart of everyone they come across. Especially affectionate with children, they hail from the ancient royal palaces of China but will feel equally at home in a small urban apartment. \nPerhaps best of all, they are content to warm your lap as you watch TV.",
    "Compact and well-balanced, the Boston makes an excellent city pet. They’re always up for a quick walk or sitting at your feet at a busy cafe. \nMostly, however, this sturdy, friendly dog is content to lap up the attention they will undoubtedly receive from passersby, who fall in love with their big round eyes and comical face.",
    "Poms are easily trainable, smart and make excellent watchdogs, despite their small frame. They love kids and can live in any environment, from a big house to a small apartment. \nPoms enjoy plenty of indoor play and short walks. They are most content, however, to provide plenty of laughs for their chosen family.",
    "Havenese are sturdy, adaptable tricksters — games come easily to them, and they love keeping the attention of humans and animals alike. Small but sturdy, Havs make excellent watch dogs, despite their small stature. \nTo keep yours from getting matted, regular grooming of their long, coarse coat is essential.",
    "Shetlands are small but agile and incredibly smart. They do well in competition when it comes to obedience, agility and herding. \nAt home, they are sensitive, affectionate and loyal to family members, but keep a protective stance with strangers.",
    "These large, sturdy working dogs thrive in cold weather — after all, they once worked on farms in Switzerland. \nToday, they make content, playful friends of the entire family, but more often than not, they'll get attached to just one person who will be lucky to have this protective best friend for life.",
    "Brittanys look like spaniels, but are smaller and have plenty of zeal, which was bred into them from their ability to hunt. \nToday, that get-up-and-go can be easily channeled into sports, competition or obedience training. The Brittany is an all-purpose partner for outdoorsy, active owners.",
    "Springers are affable dogs who love kids and other animals. They are happy to be part of the family and will eagerly join in any of its activities. \nThis tough and muscular hunter is highly trainable and loves to people please, but don’t leave them alone for too long — as this is quite a social breed.",
    "These giant dogs cast an imposing shadow when first meeting strangers, but are surprisingly gentle and friendly when they get to know people. \nWhen it comes to their families, they are patient, lovable companions that do well with gentle training. Their loyalty makes them extremely protective, and early socialization is essential.",
    "A capable bird dog, the cocker spaniel is a beloved companion to adults and kids alike. They live to please their owners and will join in any activity or a simple snuggle on the couch. \nRegular grooming is imperative to their health and happiness.",
    "As alert hunting companions, vizslas are used to working side by side with humans. A result of hundreds of years of this relationship, they’ve formed tight bonds with their owners and hate being left alone. \nVizslas excel in any activity, from sports to obedience training — and their stamina and gait also make them great running companions."
)
