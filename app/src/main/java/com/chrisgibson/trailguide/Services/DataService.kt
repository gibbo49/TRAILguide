package com.chrisgibson.trailguide.Services

import com.chrisgibson.trailguide.Model.Category
import com.chrisgibson.trailguide.Model.Item

object DataService {

    val categories = listOf(
            //Holly Mandarich
            Category("HIKING", "hiking","https://images.unsplash.com/photo-1501554728187-ce583db33af7?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=f20c7f5ad769d9bed0d1104fca8f5074&auto=format&fit=crop&w=1234&q=80"),
            //Chris Schog
            Category("CAMPING", "camping","https://images.unsplash.com/photo-1496080174650-637e3f22fa03?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=b7ca353cfcc4299e6c3d431ff862e1cf&auto=format&fit=crop&w=2206&q=80"),
            //Austin Neil
            Category("FISHING", "fishing","https://images.unsplash.com/photo-1480368319110-63b1454a3fa6?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=86dd420592ad289630f40ff8e28e716c&auto=format&fit=crop&w=2250&q=80"),
            //Jeremy Bishop
            Category("SURFING", "surfing","https://images.unsplash.com/photo-1503293962593-47247718a17a?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=2b03e5e9c2171a7b779f99f4226122d8&auto=format&fit=crop&w=2249&q=80"),
            //Mari Martin
            Category("DIVING", "diving","https://images.unsplash.com/photo-1441933968071-73ceb22464f8?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=fce315aedf4f376b985e95110fe9245c&auto=format&fit=crop&w=2167&q=80")
    )


    val hiking = listOf(
            Item("BACKPACK",
                    "backpack",
                    "http://a.co/c5eKI4l",
                    "A backpack is handy for carrying all your gear. keeps your hands free for other things.",
                    "https://images-na.ssl-images-amazon.com/images/I/91d2nGxDkVL._SL1500_.jpg"),
            Item("BOOTS",
                    "boots",
                    "http://a.co/hGVkXMV",
                    "Hi-Tec Men's Altitude Lite I Waterproof Hiking Boot",
                    "https://images-na.ssl-images-amazon.com/images/I/81in3jQxPnL._UX575_.jpg"),
            Item("COMPASS",
                    "compass",
                    "http://a.co/7Ltf66d",
                    "Eyeskey Multifunctional Military Army Aluminum Alloy Compass with Map Measurer Distance Calculator Great for Hiking, Camping, Motoring, Boating, Backpacking",
                    "https://images-na.ssl-images-amazon.com/images/I/61tPCeAI%2BzL._SL1000_.jpg"),
            Item("FLASHLIGHT",
                    "flashlight",
                    "http://a.co/dudVC47",
                    "PeakPlus Super Bright LED Tactical Flashlight Zoomable Adjustable Focus 5 Modes Water Resistant Torch with Rechargeable 18650 Lithium Ion Battery & Charger",
                    "https://images-na.ssl-images-amazon.com/images/I/61jTcFFlyEL._SL1000_.jpg"),
            Item("MAP",
                    "map",
                    "http://a.co/8mja7wn",
                    "Grand Canyon Colorado River Rafting Pocket Topo Guides & Maps (12x18\" Tear-Resistant / Waterproof)",
                    "https://images-na.ssl-images-amazon.com/images/I/9118HjlXmHL._SL1500_.jpg"),
            Item("ROPE",
                    "rope",
                    "http://a.co/0DTYGQd",
                    "3/8 Inch 50 Foot Rope, Black, Camping Rope",
                    "https://images-na.ssl-images-amazon.com/images/I/71Jk-wF2lYL._SL1500_.jpg"),
            Item("TOOLS",
                    "tools",
                    "http://a.co/2qWOJsQ",
                    "Survival Gear Kits 13 in 1- Outdoor Emergency SOS Survive Tool for Wilderness /Trip / Cars / Hiking / Camping gear - Wire Saw, Emergency Blanket, Flashlight, Tactical Pen, Water Bottle Clip ect.,",
                    "https://images-na.ssl-images-amazon.com/images/I/71duwNqebUL._SL1001_.jpg")
    )
    val camping = listOf(
            Item("FLASHLIGHT",
                    "flashlight",
                    "http://a.co/dudVC47",
                    "PeakPlus Super Bright LED Tactical Flashlight Zoomable Adjustable Focus 5 Modes Water Resistant Torch with Rechargeable 18650 Lithium Ion Battery & Charger",
                    "https://images-na.ssl-images-amazon.com/images/I/61jTcFFlyEL._SL1000_.jpg"),
            Item("ROPE",
                    "rope",
                    "http://a.co/0DTYGQd",
                    "3/8 Inch 50 Foot Rope, Black, Camping Rope",
                    "https://images-na.ssl-images-amazon.com/images/I/71Jk-wF2lYL._SL1500_.jpg"),
            Item("TOOLS",
                    "tools",
                    "http://a.co/2qWOJsQ",
                    "Survival Gear Kits 13 in 1- Outdoor Emergency SOS Survive Tool for Wilderness /Trip / Cars / Hiking / Camping gear - Wire Saw, Emergency Blanket, Flashlight, Tactical Pen, Water Bottle Clip ect.,",
                    "https://images-na.ssl-images-amazon.com/images/I/71duwNqebUL._SL1001_.jpg"),
            Item("MAP",
                    "map",
                    "http://a.co/8mja7wn",
                    "Grand Canyon Colorado River Rafting Pocket Topo Guides & Maps (12x18\" Tear-Resistant / Waterproof)",
                    "https://images-na.ssl-images-amazon.com/images/I/9118HjlXmHL._SL1500_.jpg"),
            Item("TENT",
                    "tent",
                    "http://a.co/fYlvIGo",
                    "Marmot Limelight 2 Person Camping Tent w/Footprint",
                    "https://images-na.ssl-images-amazon.com/images/I/5177ZLtBZ3L._SL1010_.jpg"),
            Item("GRILL",
                    "grill",
                    "http://a.co/5Fc24DF",
                    "Cuisinart CGG-180T Petit Gourmet Portable Tabletop Gas Grill, Red",
                    "https://images-na.ssl-images-amazon.com/images/I/61dB3B9nD1L._SL1218_.jpg"),
            Item("KNIFE",
                    "knife",
                    "http://a.co/4CS3enM",
                    "Tactical Knife - Folding Spring Assisted EDC Pocket Stainless Steel Blade Plastic Handle Paracord Lanyard - Best Urban Tourist Pocket Knife for Travel Hiking Survival Camping - Grand Way 6772 P-BCFH",
                    "https://images-na.ssl-images-amazon.com/images/I/61fjK%2BbcHRL._SL1000_.jpg"),
            Item("BACKPACK",
                    "backpack",
                    "http://a.co/c5eKI4l",
                    "A backpack is handy for carrying all your gear. keeps your hands free for other things.",
                    "https://images-na.ssl-images-amazon.com/images/I/91d2nGxDkVL._SL1500_.jpg"),
            Item("BOOTS",
                    "boots",
                    "http://a.co/hGVkXMV",
                    "Hi-Tec Men's Altitude Lite I Waterproof Hiking Boot",
                    "https://images-na.ssl-images-amazon.com/images/I/81in3jQxPnL._UX575_.jpg")
    )
    val fishing = listOf(
            Item("BACKPACK",
                    "backpack",
                    "http://a.co/c5eKI4l",
                    "A backpack is handy for carrying all your gear. keeps your hands free for other things.",
                    "https://images-na.ssl-images-amazon.com/images/I/91d2nGxDkVL._SL1500_.jpg"),
            Item("BOOTS",
                    "boots",
                    "http://a.co/hGVkXMV",
                    "Hi-Tec Men's Altitude Lite I Waterproof Hiking Boot",
                    "https://images-na.ssl-images-amazon.com/images/I/81in3jQxPnL._UX575_.jpg"),
            Item("FLASHLIGHT",
                    "flashlight",
                    "http://a.co/dudVC47",
                    "PeakPlus Super Bright LED Tactical Flashlight Zoomable Adjustable Focus 5 Modes Water Resistant Torch with Rechargeable 18650 Lithium Ion Battery & Charger",
                    "https://images-na.ssl-images-amazon.com/images/I/61jTcFFlyEL._SL1000_.jpg"),
            Item("FISHING ROD",
                    "fishing_rod",
                    "http://a.co/haYgyu8",
                    "Sabiki 8 foot bait fishing rod bait caster fishing reel combo",
                    "https://images-na.ssl-images-amazon.com/images/I/612CO0WSCeL._SL1280_.jpg"),
            Item("TOOLS",
                    "tools",
                    "http://a.co/2qWOJsQ",
                    "Survival Gear Kits 13 in 1- Outdoor Emergency SOS Survive Tool for Wilderness /Trip / Cars / Hiking / Camping gear - Wire Saw, Emergency Blanket, Flashlight, Tactical Pen, Water Bottle Clip ect.,",
                    "https://images-na.ssl-images-amazon.com/images/I/71duwNqebUL._SL1001_.jpg"),
            Item("HOOK",
                    "hook",
                    "http://a.co/8c6C84Q",
                    "Z-Sunset High Carbon Steel Freshwater Octopus Fishing Fish Hook Set - 500Pcs/10 Size",
                    "https://images-na.ssl-images-amazon.com/images/I/710OGb5dJML._SL1001_.jpg"),
            Item("KNIFE",
                    "knife",
                    "http://a.co/4CS3enM",
                    "Tactical Knife - Folding Spring Assisted EDC Pocket Stainless Steel Blade Plastic Handle Paracord Lanyard - Best Urban Tourist Pocket Knife for Travel Hiking Survival Camping - Grand Way 6772 P-BCFH",
                    "https://images-na.ssl-images-amazon.com/images/I/61fjK%2BbcHRL._SL1000_.jpg"),
            Item("LURE",
                    "lure",
                    "http://a.co/bd49QW2",
                    "Wannabuy Artificial Silicone Soft Bait Set, Luminous Shrimp Fishing Lure with Hook Fishing Tackle, Freshwater/ Saltwater（3pcs/lot 8.5cm 6g）",
                    "https://images-na.ssl-images-amazon.com/images/I/61GUlKCMYGL._SL1000_.jpg")
    )
    val surfing = listOf(
            Item("BACKPACK",
                    "backpack",
                    "http://a.co/c5eKI4l",
                    "A backpack is handy for carrying all your gear. keeps your hands free for other things.",
                    "https://images-na.ssl-images-amazon.com/images/I/91d2nGxDkVL._SL1500_.jpg")
    )
    val diving = listOf(
            Item("FLIPPERS",
                    "flippers",
                    "http://a.co/4SYONVe",
                    "Seavenger Swim Fins/Flippers with Gear Bag for Snorkeling & Diving, Perfect for Travel",
                    "https://images-na.ssl-images-amazon.com/images/I/816FCRQn4UL._SL1500_.jpg"),
            Item("KNIFE",
                    "knife",
                    "http://a.co/4CS3enM",
                    "Tactical Knife - Folding Spring Assisted EDC Pocket Stainless Steel Blade Plastic Handle Paracord Lanyard - Best Urban Tourist Pocket Knife for Travel Hiking Survival Camping - Grand Way 6772 P-BCFH",
                    "https://images-na.ssl-images-amazon.com/images/I/61fjK%2BbcHRL._SL1000_.jpg"),
            Item("MASK",
                    "mask",
                    "http://a.co/j5S9tMu",
                    "Kungber Snorkel Mask One Size for All with Anti-fog 180°Lens Earache Eliminator Snorkel Mask Full Face No Leaking Water for Adult and Children",
                    "https://images-na.ssl-images-amazon.com/images/I/71I%2Bwb1J%2BKL._SL1200_.jpg"),
            Item("OXYGEN",
                    "ox",
                    "http://a.co/eyN4Ofk",
                    "New 3.0CF Spare Air Emergency Air Supply for Scuba Diving (Tank/Reg Only)",
                    "https://images-na.ssl-images-amazon.com/images/I/41M%2B1c9lqxL.jpg"),
            Item("OXYGEN MASK",
                    "ox_mask",
                    "http://a.co/38ApT1f",
                    "Ocean Reef Neptune Space G. Divers Series Full Face Mask Kit",
                    "https://images-na.ssl-images-amazon.com/images/I/51UZaaS7%2BgL.jpg"),
            Item("ROPE",
                    "rope",
                    "http://a.co/0DTYGQd",
                    "3/8 Inch 50 Foot Rope, Black, Camping Rope",
                    "https://images-na.ssl-images-amazon.com/images/I/71Jk-wF2lYL._SL1500_.jpg"),
            Item("TOOLS",
                    "tools",
                    "http://a.co/2qWOJsQ",
                    "Survival Gear Kits 13 in 1- Outdoor Emergency SOS Survive Tool for Wilderness /Trip / Cars / Hiking / Camping gear - Wire Saw, Emergency Blanket, Flashlight, Tactical Pen, Water Bottle Clip ect.,",
                    "https://images-na.ssl-images-amazon.com/images/I/71duwNqebUL._SL1001_.jpg")
    )

    fun getItems(category: String):List<Item>{
        return when(category) {
            "HIKING" -> hiking
            "CAMPING" -> camping
            "FISHING" -> fishing
            "SURFING" -> surfing
            else -> diving
        }
    }
}